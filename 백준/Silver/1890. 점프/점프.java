import java.util.*;
import java.io.*;
/*
 * 실버 1 dp
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];
        long[][] dp = new long[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = 1L;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                if(dp[i][j] == 0) continue;
                if(i == n && j == n) continue;
                int a = arr[i][j]; // 이동할 값
                if(i + a <= n){
                    dp[i + a][j] += dp[i][j];
                }
                if(j + a <= n){
                    dp[i][j + a] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}