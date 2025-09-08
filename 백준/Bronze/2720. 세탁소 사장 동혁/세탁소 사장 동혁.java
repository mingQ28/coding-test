import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] bal = {25, 10, 5 ,1};
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for(int j = 0; j < 4; j++) {
				System.out.print(m / bal[j] + " ");
				m %= bal[j];
			}
			System.out.println();
		}
		
	}
}
