import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			System.out.print(str[0] + str[str.length - 1]);
            System.out.println();
		}
	}

}