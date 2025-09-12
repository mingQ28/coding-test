import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] str = Arrays.stream((a*b*c + "").split("")).mapToInt(Integer::parseInt).toArray();
        for(int i : str){
            arr[i]++;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}