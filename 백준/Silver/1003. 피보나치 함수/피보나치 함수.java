import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // [n][0]은 n번째에서의 0의 개수 dp[0][0] = 1, fibo(0) = 1
        // [n][1]은 n번째에서의 1의 개수 dp[1][1] = 1, fibo(1) = 1
        int[][] dp = new int[41][2];
        dp[0][0] = 1; // 기초값 설정
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
            }
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}