import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] str = new char[5][15];
		for(int i = 0; i < 5; i++) {
			String a = br.readLine();
			for(int j = 0; j < a.length(); j++) {
				str[i][j] = a.charAt(j);
			}
		}
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(str[j][i] == '\0')
					continue;
				System.out.print(str[j][i]);
			}
		}
	}
}
