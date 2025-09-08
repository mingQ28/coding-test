import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[31];
        for(int i = 1; i < 29; i++){
            int a = Integer.parseInt(br.readLine());
            n[a] = 1;
        }
        for(int i = 1; i < 31; i++){
            if(n[i] != 1)
            	System.out.println(i);
        }
	}
}