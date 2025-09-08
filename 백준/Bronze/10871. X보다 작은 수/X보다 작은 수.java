import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        String[] strr = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(strr[i]);
            if(x > a)
                System.out.print(a + " ");
        }
    }
}