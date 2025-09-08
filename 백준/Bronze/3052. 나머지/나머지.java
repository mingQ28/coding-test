import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] divi = new int[42];
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            divi[a % 42]++;
        }
        for(int i = 0; i < 42; i++){
            if(divi[i] >= 1)
            	cnt++;
        }
        System.out.println(cnt);
	}
}