import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int max = -1;
		int rowIdx = 0;
		int colIdx = 0;
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				int a = Integer.parseInt(st.nextToken());
				if(max < a) {
					max = a;
					rowIdx = i;
					colIdx = j;
				}
			}
		}
		sb.append(max).append("\n").append(rowIdx + 1).append(" ").append(colIdx + 1);
		System.out.println(sb.toString());
	}
}