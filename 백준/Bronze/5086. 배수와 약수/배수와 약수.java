import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals(str[1]))
				break;
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(b % a == 0)
				System.out.println("factor");
			else if(a % b == 0)
				System.out.println("multiple");
			else 
				System.out.println("neither");
		}
	}
}
