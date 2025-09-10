import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        Integer[] array = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        // (6, 10, 2)와 같이 앞의자리가 큰 수대로 정렬 -> (6, 2, 10)
        Arrays.sort(array, (a, b) -> {
            String aS = a + "" + b;
            String bS = b + "" + a;
            return bS.compareTo(aS);
        });
        // 이어붙이기
        StringBuilder sb = new StringBuilder();
        for(int i : array){
            sb.append(i);
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}