import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // -2^62 <= 값 <= 2^62
        // int는 런타임에러
        int n = Integer.parseInt(br.readLine());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(br.readLine())); // parseLong 사용
        }
        Collections.sort(list);
        long mostValue = list.get(0);
        long maxCount = 1;

        long currentValue = list.get(0);
        long currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (!list.get(i).equals(currentValue)) { // long 비교는 equals 사용
                currentCount = 1;
                currentValue = list.get(i);
            } else {
                currentCount++;
            }
            if (maxCount < currentCount) {
                maxCount = currentCount;
                mostValue = currentValue;
            }
        }
        System.out.println(mostValue);
    }
}