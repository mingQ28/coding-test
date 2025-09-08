import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i = 0; i < str.length() / 2; i++) {
			char f = str.charAt(i);
			char b = str.charAt(str.length() - i - 1);
			if(f != b) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}