import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr = (n + "").split("");
        String s=  "";
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        long answer = Long.parseLong(s);
        
        return answer;
    }
}