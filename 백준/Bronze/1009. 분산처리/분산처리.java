
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int result = 1;
            for (int j = 1; j <= b; j++) {
                result = result * a % 10; // 1의 자리만 계산
            }
            result = result == 0 ? 10 : result;
            System.out.println(result);
        }
    }
}