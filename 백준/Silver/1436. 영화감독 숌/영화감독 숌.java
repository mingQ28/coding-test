import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static boolean[][] board;
	static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		int end = 665;
		
		while(cnt > 0) {
			end++;
			String s = Integer.toString(end);
			if(s.contains("666"))
				cnt--;
		}
		
		System.out.println(end);
		
	}
} 