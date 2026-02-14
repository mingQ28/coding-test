import java.io.*;
import java.util.*;

/**
 * 실버 5
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken()); // 행
        int c = Integer.parseInt(st.nextToken()); // 열

        int[][] arr = new int[9][3]; // 선수번호, 위치, 등수
        for (int i = 0; i < 9; i++) { // 선수번호 미리 저장
            arr[i][0] = i + 1;
        }

        for(int i = 0; i < r; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch >= '1' && ch <= '9'){ // 숫자인 경우
                    arr[ch - '0' - 1][1] = j; // 배열에 처음 숫자가 나온 인덱스 저장, 해당 인덱스가 가장 큰 수일수록 결승선에 근접
                    break;
                }
            }
        }

        Arrays.sort(arr, (a, b) -> { // 위치를 기준으로 내림차순 정렬
            return b[1] - a[1];
        });

        int rank = 1;
        arr[0][2] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] != arr[i - 1][1]) {
                rank++;   // 값이 달라질 때만 증가
            }
            arr[i][2] = rank;
        }

        Arrays.sort(arr, (a, b) -> { // 선수번호를 기준으로 내림차순 정렬
            return a[0] - b[0];
        });

        for(int i = 0; i < 9; i++){
            System.out.println(arr[i][2]);
        }
    }
}