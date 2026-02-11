import java.io.*;
import java.util.*;

/**
 * 실버 4
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 1부터 n까지

        Deque<Integer> que = new ArrayDeque<>();
        for(int i = 1; i <= n; i++){
            que.addLast(i); // 1부터 차례대로 큐에 추가
        }

        int result = -1;
        while(true){
            result = que.removeFirst(); // 먼저 큐 앞단에 있는 수 제거

            if(que.isEmpty()){
                System.out.println(result);
                break;
            }
            int a = que.pollFirst(); // 그 다음에 위치한 수를 제거해서 큐의 맨 마지막에 추가
            que.addLast(a);
        }
    }
}