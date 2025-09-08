import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n;
		int max = Math.max(a, Math.max(b, c));
		if (max >= (a + b + c) - max) {
			n = ((a + b + c) - max) * 2 - 1;
			// 최대값이 a, b, c인지 모르는 상태에서 전체합 - 최대값을 하면 나머지 두 변의 합을 알 수 있음
			// 변 길이가 다 다른 상태에서 최대 둘레 길이를 정할려면 최대값이 나머지 두 변의 합보다 1 적어야 됨
			// 총 둘레는 변의 길이 최대값(나머지 두 변의 길이 - 1) + 나머지 두 변의 길이
			// 나머지 두 변의 길이 * 2 - 1
		} else {
			n = a + b + c;
		}

		System.out.println(n);
	}
}
