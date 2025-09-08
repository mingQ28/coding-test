import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<List<String>> list = new ArrayList<>();
    for(int i = 0; i < n; i++){
      List<String> li = new ArrayList<>( Arrays.asList(br.readLine().split(" ")));
      list.add(li);
    }
    list.sort((a, b) -> {
        int korA = Integer.parseInt(a.get(1));
        int korB = Integer.parseInt(b.get(1));
        if (korA == korB) {
            int engA = Integer.parseInt(a.get(2));
            int engB = Integer.parseInt(b.get(2));
            if (engA == engB) {
                int mathA = Integer.parseInt(a.get(3));
                int mathB = Integer.parseInt(b.get(3));
                if (mathA == mathB) {
                    return a.get(0).compareTo(b.get(0));
                }
                return Integer.compare(mathB, mathA);
            }
            return Integer.compare(engA, engB);
        }
        return Integer.compare(korB, korA);
    });
    for(List<String> str : list){
      System.out.println(str.get(0));
    }
  }
}