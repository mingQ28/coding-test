import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[] basket = new int[n + 1];
		for (int i = 1; i <= n; i++)
			basket[i] = i;
		for (int i = 0; i < m; i++) {
			String[] num = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			while(a < b) {
				int tmp = basket[a];
				basket[a] = basket[b];
				basket[b] = tmp;
				a++;
				b--;
			}
		}
		for (int i = 1; i <= n; i++)
			System.out.print(basket[i] + " ");
	}
}