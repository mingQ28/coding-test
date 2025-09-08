import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] string = new String[t];
        for(int i = 0; i < t; i++){
            string[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string[0].length(); i++){
            char str = string[0].charAt(i); 
            for(int j = 1; j < t; j++){
                if(string[j].charAt(i) != str){
                    str = '?';
                }
            }
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
