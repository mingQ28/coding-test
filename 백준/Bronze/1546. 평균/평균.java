import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] grade = new int[n];
        for(int i = 0; i < n; i++) {
        	grade[i] = Integer.parseInt(str[i]);
        }
        int max = grade[0];
        for(int i = 0; i < n; i++) {
        	if(max < grade[i])
        		max = grade[i];
        }
        double sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += (double)grade[i] / max * 100;
        }
        System.out.println(sum / n);
	}
}