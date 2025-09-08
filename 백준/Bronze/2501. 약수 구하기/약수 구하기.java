import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int num = 0;
		for(int i = 1; i <= n; i++) {
			num = 0;
			if(n % i == 0) {
				k--;
				if(k == 0) {
					num = i;
					break;
				}
			}			
		}
		System.out.println(num);
	}
}
