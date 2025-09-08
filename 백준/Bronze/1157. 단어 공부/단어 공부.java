import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] alp = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				alp[str.charAt(i) - 97]++;
			else {
				alp[str.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char same = '?';
		for(int i = 0; i < 26; i++) {
			if(max < alp[i]) {
				max = alp[i];
				same = (char) (i + 65);
			}
			else if(max == alp[i])
				same = '?';
		}
		System.out.println(same);
	}
}