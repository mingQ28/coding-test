import java.io.*;
import java.util.*;

/**
 * 브론즈 2
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전구의 개수
        int m = Integer.parseInt(st.nextToken()); // 명령어의 개수

        st = new StringTokenizer(br.readLine());
        int[] lights = new int[n + 1]; // 전구의 상태
        for(int i = 1; i <= n; i++){
            int a = Integer.parseInt(st.nextToken());
            lights[i] = a;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 명령어 번호
            int b = Integer.parseInt(st.nextToken()); // 명령어가 1이면 i, 이외에는 l
            int c = Integer.parseInt(st.nextToken()); // 명령어가 1이 x, 이외에는 r

            switch(a){
                case 1:
                    lights[b] = c; // 1번 명령어의 경우, i번째 전구 상태를 x로 변경
                    break;
                case 2:
                    for(int j = b; j <= c; j++){
                        lights[j] = lights[j] == 1 ? 0 : 1; // 2번 명령어의 경우, l ~ r번째 전구 상태를 변경
                    }
                    break;
                case 3:
                    for(int j = b; j <= c; j++){
                        lights[j] = 0; // 3번 명령어의 경우, l ~ r번째 전구 상태를 끔
                    }
                    break;
                case 4:
                    for(int j = b; j <= c; j++){
                        lights[j] = 1; // 4번 명령어의 경우, l ~ r번째 전구 상태를 킴
                    }
                    break;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(lights[i] + " ");
        }
    }
}