import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if(t == 1){
            int n = Integer.parseInt(br.readLine());
            System.out.println(n * n);
            return;
        }
        int[] num = new int[t];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < t; i++){ // string to int
            num[i] = Integer.parseInt(str[i]);
        }
        // 약수의 성질 
        // 가장 작은 수 X 가장 큰 수 = n이 되는 경우가 많음
        // 먼저 정렬을 통해 가장 큰 수 구하기
        Arrays.sort(num);
        int max = num[0] * num[t - 1];
        System.out.println(max);
    }
}
