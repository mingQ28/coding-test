import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for(int i = 0; i < t; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a, b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        System.out.println(arr[0]);
        for(int i = 1; i < t; i++){
            if(arr[i].equals(arr[i - 1])){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
