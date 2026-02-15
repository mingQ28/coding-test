import java.io.*;
import java.util.*;

/**
 * 브론즈 1
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 채널의 개수
        String[] channels = new String[n];

        for(int i = 0; i < n; i++){
            channels[i] = br.readLine();
        }

        for(int i = 0; i < n; i++){ // 0부터 kbs1먼저 찾은 후 i부터 0번째까지 스왑하면서 이동
            if(channels[i].equals("KBS1")){
                for(int j = 0; j < i; j++){ // 위치만큼 아래로 커서 내리기
                    sb.append(1);
                }
                
                for(int j = i; j > 0; j--){
                    String tmp = channels[j];
                    channels[j] = channels[j - 1];
                    channels[j - 1] = tmp;
                    sb.append(4);
                }

                int idx = 0;
                for(int j = 0; j < n; j++){ // kbs2 위치 찾기
                    if(channels[j].equals("KBS2")){
                        idx = j;
                        break;
                    }
                }

                for(int j = 0; j < idx; j++){ // 위치만큼 아래로 커서 내리기
                    sb.append(1);
                }

                for (int j = idx; j > 1; j--) { // 1번째 위치로 올리기
                    String tmp = channels[j];
                    channels[j] = channels[j - 1];
                    channels[j - 1] = tmp;
                    sb.append(4);
                }

                break;
            }
        }
        System.out.println(sb);
    }
}