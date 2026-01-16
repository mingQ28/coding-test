import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String str = br.readLine();
            System.out.println(str.matches("[A-F]?A+F+C+[A-F]?$") ? "Infected!" : "Good");
        }
    }
}