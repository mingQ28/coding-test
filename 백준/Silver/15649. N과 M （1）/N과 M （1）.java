import java.util.*;
import java.io.*;

/**
 * [문제 요약]
 * 백트래킹문제
 * 작은 수부터 탐색하면 자동 오름차순을 만족
 */

public class Main {
    static int n, m;
    static boolean[] v;
    static int[] s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = new int[m];
        v = new boolean[n];
        backtracking(0);
    }
    private static void backtracking(int len){
        if(len == m){ // 정답인지 확인
            printArray();// 수열 출력
            return;
        }
        for(int i = 0; i < n; i++){ // 갈 수 있는 모든 선택지
            if(!v[i]) {// 만약 사용하지 않았다면
                v[i] = true;
                s[len] = i;
                backtracking(len + 1); // 재귀
                v[i] = false;
            }
        }
    }
    private static void printArray(){
        for(int i = 0; i < m; i++){
            System.out.print(s[i] + 1 + " ");
        }
    }
}
