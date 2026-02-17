import java.io.*;
import java.util.*;

/**
 * 실버 3 백트래킹
 */

public class Main {
    static boolean[] visited;
    static int[] weights;
    static int n, k, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 운동 키트 개수
        k = Integer.parseInt(st.nextToken()); // 감소량

        weights = new int[n]; // 운동 키트

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            weights[i] = Integer.parseInt(st.nextToken());
        }

        count = 0; // 500을 넘지 않는 개수
        visited = new boolean[n];
        tracking(500, 0);

        System.out.println(count);
    }

    static void tracking(int sum, int idx){
        if(sum < 500) return; // 조건을 만족하지 못하면 먼저 가지치기

        if(idx == n){ // 운동키트 개수만큼 탐색 완료하면 종료
            count++;
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){ // 방문되지 않았고 500이 넘으면
                visited[i] = true;
                tracking((sum + weights[i] - k), idx + 1);
                visited[i] = false;
            }
        }
    }
}