import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] basket = new int[n + 1];
        for(int i = 0; i < m; i++) {
        	String[] num = br.readLine().split(" ");
        	int a = Integer.parseInt(num[0]);
        	int b = Integer.parseInt(num[1]);
        	int c = Integer.parseInt(num[2]);
        	for(int j = a; j <= b; j++) {
        		basket[j] = c;
        	}
        }
        for(int i = 1; i <= n; i++)
        	System.out.print(basket[i] + " ");
	}
}