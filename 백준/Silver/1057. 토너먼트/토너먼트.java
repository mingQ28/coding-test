import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();
        int count = 0;
        while(arr[1] != arr[2]){
            arr[1] = (arr[1] + 1) / 2;
            arr[2] = (arr[2] + 1) / 2;

            count++;
        }
        System.out.println(count);

    }
}
