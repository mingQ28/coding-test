import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int[] chess = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < str.length; i++) {
			int a = Integer.parseInt(str[i]);
			System.out.print(chess[i] - a + " ");
		}
		System.out.println();

	}
}
