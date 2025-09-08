import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i = 0; i < 8; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0; j < 8; j++){
                if(i % 2 == 0 && j % 2 == 0){
                    if(arr[j].equals("F")){
                        count++;
                    }
                }
                if(i % 2 != 0 && j % 2 != 0){
                    if(arr[j].equals("F")){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}