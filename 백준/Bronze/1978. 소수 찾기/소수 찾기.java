import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			for (int j = 2; j <= a; j++) {
				if (j != a && a % j == 0)
					break;
				if (j == a)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
