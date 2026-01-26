import java.io.*;
import java.util.*;

/**
 * 실버 5
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        System.out.println(a % 2 == 0 ? "CY" : "SK");
        
    }
}