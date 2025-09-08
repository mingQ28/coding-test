import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        
        char[] nb = b.toCharArray();
        
        System.out.println(a * (nb[2] - '0'));
        System.out.println(a * (nb[1] - '0'));
        System.out.println(a * (nb[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
        
    }
}