import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pQ = new PriorityQueue<>((a, b) -> {
            if(Math.abs(a) != Math.abs(b))
                        return Integer.compare(Math.abs(a), Math.abs(b));
                    return Integer.compare(a, b);
        });
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            if(n != 0){ // n이 0이 아니면 리스트에 추가
                pQ.offer(n);
            }else{
                
                if(pQ.isEmpty()){ // 리스트가 비어있다면 0출력
                    System.out.println(0);
                }else { // 0번째 인덱스 출력
                    System.out.println(pQ.remove());
                }
            }
        }
    }
}
