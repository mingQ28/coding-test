import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			int re = n % b;
			if(re < 10)
				sb.append((char)(re + '0'));
			else 
				sb.append((char)(re - 10 + 'A'));
			n /= b;
		}
		System.out.println(sb.reverse().toString());
	}
}
