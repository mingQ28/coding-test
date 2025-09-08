import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			a[i] = m;
		}
		Arrays.sort(a);
		for(int i = 0; i < n; i++) 
			System.out.println(a[i]);
	}
} 