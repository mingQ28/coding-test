import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 1;
		int cnt = 1;
		while(n > a) {
			a += 6 * cnt;
			cnt++;
		}
		System.out.println(cnt);
	}
}
