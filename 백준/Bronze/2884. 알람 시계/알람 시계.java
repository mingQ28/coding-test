import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int h, m;
        if(b >= 45){
            h = a;
            m = b - 45;
        }
        else {
            h = a - (b / 60) - 1;
            m = 15 + (b % 60);
        }
        h = (h == -1) ? 23 : h;
        System.out.println(h + " " + m);
    }
}