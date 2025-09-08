import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 1;
		while(true) {
			if((a - 1) * a / 2 < n && n <= a * (a + 1) / 2)
				break;
			a++;
		}
		int tmp = a * (a + 1) / 2;
		if(a % 2 != 0) {
			System.out.print((tmp - n + 1)+ "/" + (a - tmp + n));
		}else {
			System.out.print((a - tmp + n)+ "/" + (tmp - n + 1));
		}
	}
}
