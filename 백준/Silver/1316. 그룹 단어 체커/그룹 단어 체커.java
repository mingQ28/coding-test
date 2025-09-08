import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			boolean[] alp = new boolean[26];
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.charAt(j) != s.charAt(j + 1)) {
					if(alp[s.charAt(j + 1) - 97] == true) {
						cnt--;
						break;
					}
				}
				alp[s.charAt(j) - 97] = true;
			}
		}
		System.out.println(cnt);
	}
}
