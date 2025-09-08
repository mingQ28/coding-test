import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		String[] num = br.readLine().split(" ");
		int[] cardN = new int[n];
		for(int i = 0; i < n; i++) {
			cardN[i] = Integer.parseInt(num[i]);
		}
		int sum = 0;
		int sumNear = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					sum = cardN[i] + cardN[j] + cardN[k];
					if(sum <= m && sum >= sumNear) {
						sumNear = sum;
					}
				}
			}
		}
		System.out.println(sumNear);
	}
} 