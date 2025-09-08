import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int sum = 0, min = b;
		for (int i = a; i <= b; i++) {
			boolean t = true;
			if(i == 1)
				t = false;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					t = false;
					break;
				}	
			}
			if(t) {
				if(min > i)
					min = i;
				sum += i;
			}
		}
		if(sum == 0) 
			System.out.println(-1);
		
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
