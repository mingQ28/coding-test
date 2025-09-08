import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(br.readLine());
        int h, m;
        if(b + c <= 59){
            h = a;
            m = b + c;
        }
        else if((b + c) % 60 == 0){
            h = a + ((b + c) / 60);
            m = 0;
        }
        else {
            h = a + ((b + c) / 60);
            m = (b + c) % 60;
        }
        h = h > 23 ? h - 24 : h;
        System.out.println(h + " " + m);
    }
}