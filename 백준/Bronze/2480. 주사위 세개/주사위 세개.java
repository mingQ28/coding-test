import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int money = 0;
        if(a != b && a != c && b != c){
            int max = a > b ? a : b;
            max = max > c ? max : c;
            money = max * 100;
        } else {
            if(a == b && a == c)
                money = 10000 + a * 1000;
            else {
                if(a == b || a == c)
                    money = 1000 + a * 100;
                else
                    money = 1000 + b * 100;
            }
        }
        System.out.println(money);
    }
}