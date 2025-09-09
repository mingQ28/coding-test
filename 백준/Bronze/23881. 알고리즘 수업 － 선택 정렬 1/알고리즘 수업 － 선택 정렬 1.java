import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        selection_sort(num, arr[1]);
    }
    public static void selection_sort(int[] num, int n){
        int count = 0;
        for(int i = num.length - 1; i >= 0; i--){
            int max = i;
            for(int j = 0; j < i; j++ ){
                if(num[j] > num[max]){
                    max = j;
                }
            }
            if(max != i){
                int tmp = num[i];
                num[i] = num[max];
                num[max] = tmp;
                count++;
            }
            if(count == n){
                System.out.println(num[max] + " " + num[i]);
                return;
            }
        }
        if(count != n){
            System.out.println(-1);
        }
    }
}
    

