import java.util.*;
import java.io.*;

public class Main{
    static int[][] map = new int[10][10]; // 10x10 map
    static int[] s= {0, 5, 5, 5, 5, 5}; // 색종이 수 저장
    static int result = Integer.MAX_VALUE; // 결과값 저장 변수
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 10; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backtracking(0, 0); // 좌표, 몇 개 색종이 사용했는지
        if(result == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);
    }
    private static void backtracking(int xy, int useCnt){
        if(xy == 100){ // 끝까지 확인
            result = Math.min(result, useCnt); // update
            return;
        }
        int x = xy % 10; // 킥, 알아두면 좋은 팁
        int y = xy / 10;
        // 가지치기
        if(result <= useCnt) 
            return;
        if(map[y][x] == 1){
            for(int i = 5; i > 0; i--){
                if(s[i] > 0 && check(x, y, i)){
                    s[i]--;
                    fill(x, y, i, 0);
                    backtracking(xy + 1, useCnt + 1);
                    fill(x, y, i, 1);
                    s[i]++;
                }
            }
        }else { // 색종이 붙일 필요 없음
            backtracking(xy + 1, useCnt);
        }
    }
    private static void fill(int x, int y, int size, int num){
        for(int i = y; i < y + size; i++){
            for(int j = x; j < x + size; j++){
                map[i][j] = num;
            }
        }
    }
    private static boolean check(int x, int y, int size){
        if(x + size > 10 || y + size > 10)
            return false;
        for(int i = y; i < y + size; i++){
            for(int j = x; j < x + size; j++){
                if(map[i][j] != 1)
                    return false;
            }
        }
        return true;
    }
}