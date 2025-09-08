import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int a = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			if(a == -1)
				break;
			int sum = 1;
			sb.append(a + " = 1");
			for(int i = 2; i < a; i++) {
				if(a % i == 0) { 
					sb.append(" + " + i);
					sum += i;
				}
			}
			if(sum == a) {
				System.out.println(sb);
			} else 
				System.out.println(a + " is NOT perfect.");
		}
	}
}
