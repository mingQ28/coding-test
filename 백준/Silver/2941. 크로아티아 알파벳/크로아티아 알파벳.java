import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str = br.readLine();
		
		for(int i = 0; i< cro.length; i++) {
			if(str.contains(cro[i]))
				str = str.replace(cro[i], "?");
		}
		System.out.println(str.length());
	}
}
