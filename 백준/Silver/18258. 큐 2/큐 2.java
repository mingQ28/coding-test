import java.util.*;
import java.io.*;
/*
 * 실버 4 queue
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new ArrayDeque<>();
        int t = Integer.parseInt(br.readLine()); // 명령 개수
        int last = 0; // 마지막에 넣은 값을 알기 위한 값
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "push":
                    int a = Integer.parseInt(st.nextToken());
                    que.add(a);
                    last = a;
                    break;
                case "pop":
                    sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
                    break;
                case "back":
                    sb.append(que.isEmpty() ? -1 : last).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}