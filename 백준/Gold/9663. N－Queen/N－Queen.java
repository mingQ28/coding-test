import java.util.*;
import java.io.*;

/**
 * [문제 요약]
n개의 퀸을 체스판 위에서 서로 공격할 수 없는 위치를 찾아라
퀸의 동작 : 가로, 세로, 대각선
퀸은 행마다 하나씩 배치하면 서로 공격할 수 없는 위치에 놓인다.


 */

public class Main {
    static int[] chess; // 체스판
    static int n;
    static int cnt = 0; // 출력할 값
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken()); // 전체 숫자의 개수 (1~n)
        chess = new int[n];
        backtracking(0);
        System.out.println(cnt);
    }
    private static void backtracking(int row){
        if(row == n){
            cnt++;
            return;
        }
        for(int i = 0; i < n; i++){
            chess[row] = i;
            if(check(row)){ // 가지치기 유효성 검사
                backtracking(row + 1);
            }
        }
    }
    private static boolean check(int row){
        for(int i = 0; i < row; i++){
            if(chess[i] == chess[row]) // 일직선 공격
                return false;
            if(Math.abs(row - i) == Math.abs(chess[row] - chess[i])) // 대각선공격
                return false;
        }
        return true;
    }
}
