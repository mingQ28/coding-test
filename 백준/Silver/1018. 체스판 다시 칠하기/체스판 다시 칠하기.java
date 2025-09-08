import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static boolean[][] board;
	static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		board = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			String bw = br.readLine();
			for(int j = 0; j < m; j ++) {
				if(bw.charAt(j) == 'W')
					board[i][j] = true;
				else 
					board[i][j] = false;
			}
		}
		for(int i = 0; i < n - 7; i++) {
			for(int j = 0; j < m - 7; j++) {
				findMin(i, j);
			}
		}
		System.out.println(min);
	}
	public static void findMin(int x, int y) {
		int cnt = 0;
		boolean first = board[x][y];
		
		for(int i = x; i < x + 8; i++) {
			for(int j = y; j < y + 8; j++) {
				if((i + j) % 2 == 0) {
					if(board[i][j] != first)
						cnt++;
				}else {
					if(board[i][j] == first)
						cnt++;
				}
			}
		}
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
	}
} 