import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int count = 0;
            int sum = 0;
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 'O'){
                    sum += ++count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}