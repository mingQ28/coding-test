import java.io.*;
import java.util.*;

/**
 * 골드 5 bfs
 */

public class Main {
    static int max = 100000;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[max + 1];
        Queue<int[]> que = new ArrayDeque<>(); // 현재 위치, 소요된 시간
        que.add(new int[] {n, 0}); // 첫 시작은 수빈이의 위치, 0초

        while(!que.isEmpty()){
            int[] a = que.poll();
            visited[a[0]] = true;

            if(a[0] == k){
                answer = Math.min(answer, a[1]);
            }

            if(a[0] * 2 <= max && !visited[a[0] * 2]){
                que.add(new int[] {a[0] * 2, a[1] + 0});
            }
            if(a[0] + 1 <= max && !visited[a[0] + 1]){
                que.add(new int[] {a[0] + 1, a[1] + 1});
            }
            if(a[0] - 1 >= 0 && !visited[a[0] - 1]){
                que.add(new int[] {a[0] - 1, a[1] + 1});
            }
        }
        System.out.println(answer);
    }
}