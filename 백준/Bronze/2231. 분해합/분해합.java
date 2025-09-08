import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = n;
		int len = 0;
		while(m > 0) {
			m /= 10;
			len++;
		}
		int num = 0;
		for(int i = n - len * 9; i <= n; i++) {
			int sum = i;
			int tmp = i;
			while(tmp > 0) {
				sum += (tmp % 10);
				tmp /= 10;
			}
			if(sum == n) {
				num = i;
				break;
			}
		}
		
		System.out.println(num);
	}
} 