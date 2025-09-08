import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] n = br.readLine().split("");
		int[] num = new int[n.length];
		for(int i = 0; i < n.length; i++) {
			num[i] = Integer.parseInt(n[i]);
		}
		Arrays.sort(num);
		for(int i = n.length - 1; i >= 0; i--)
			System.out.print(num[i]);
	}
} 