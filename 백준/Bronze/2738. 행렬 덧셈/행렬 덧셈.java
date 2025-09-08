import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(s[j]);
			}
		}
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(s[j]);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(a[i][j] + b[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
