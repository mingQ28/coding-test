import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < str.length; i++){
            int a = Integer.parseInt(str[i]);
            if(a == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}