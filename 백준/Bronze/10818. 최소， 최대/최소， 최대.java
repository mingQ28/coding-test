import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        for(int i = 1; i < n; i++){
            int a = Integer.parseInt(str[i]);
            if(min > a)
                min = a;
            if(max < a)
                max = a;
        }
        System.out.println(min + " " + max);
    }
}