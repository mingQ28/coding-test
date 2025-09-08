import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int k;
    private static int count = 0;
    private static boolean isCount = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        k = arr[1];
        int[] quick = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        quick_sort(quick, 0, arr[0] - 1);
        if(!isCount){
            System.out.println("-1");
        }
    }
    public static void quick_sort(int[] arr, int start, int end){
        if(isCount){
            return ;
        }
        if(start < end) {
            int part = partition(arr, start, end);
            quick_sort(arr, start, part - 1);
            quick_sort(arr, part + 1, end); 
        }
    }
    public static int partition(int[] arr, int start, int end){
        int x = arr[end];
        int idx = start - 1;
        for(int i = start; i < end; i++){
            if(arr[i] <= x){
                swap(arr, ++idx, i);
            }
        }
        if(idx + 1 != end) // 여기 조건 추가
            swap(arr, idx + 1, end);
        return idx + 1;
    }
    public static void swap(int[] arr, int a, int b){
        if(isCount){
            return ;
        }
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

        count++;
        if(k == count){
            System.out.println(arr[a] + " " + arr[b]);
            isCount = true;
        }
                
    }
}
