import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int maxX = 0, maxY = 0, minX = 100000, minY = 100000;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(i == 0) {
				maxX = minX = x;
				maxY = minY = y;
			}
			if(maxX < x)
				maxX = x;
			if(maxY < y)
				maxY = y;
			if(minX > x)
				minX = x;
			if(minY > y)
				minY = y;
		}
		System.out.println((maxX - minX) * (maxY - minY));
	}
}
