import java.util.*;
import java.io.*;
/**
 문제 해결방법

 */

public class Main{
    static int n;
    static int[][] arr;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    static boolean success = false;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        n = Integer.parseInt(br.readLine()); // 정사각형 길이

        arr = new int[n][n]; // 배열 크기 초기화
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(str[j]); // 값 저장
            }
        }
        dfs(0, 0); // 시작 부분부터 시작
        if (success) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    private static void dfs(int i, int j) {
        if(success) return;
        if(arr[i][j] == -1){ // 도착지점에 입장하면 리턴
            success = true;
            return;
        }
        if (arr[i][j] == 0) return; // 0이면 이동 불가
        
        for(int k = 0; k < 2; k++){
            int x = i + dx[k] * arr[i][j]; 
            int y = j + dy[k] * arr[i][j];
            
            if(x >= 0 && x < n && y >= 0 && y < n){
                dfs(x, y);
            }
        }
        
    }

}