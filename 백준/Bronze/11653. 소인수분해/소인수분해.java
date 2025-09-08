import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		if(a == 1)
			return;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			while(a % i == 0) {
				a /= i;
				sb.append(i + "\n");
			}
		}
		if(a != 1)
			sb.append(a);
		System.out.println(sb);
	}
}
