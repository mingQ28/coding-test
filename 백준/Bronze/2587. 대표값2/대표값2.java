import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int m = Integer.parseInt(br.readLine());
			a[i] = m;
			sum += m;
		}
		Arrays.sort(a);
		System.out.println(sum / 5);
		System.out.println(a[2]);
	}
} 