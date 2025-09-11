import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] a = {-1};
            return a;
        }
        int min = Arrays.stream(arr)   // IntStream 생성
                .min()
                .orElseThrow();
        int[] answer = new int[arr.length - 1];
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min)
                continue;
            answer[a++] = arr[i];
        }
        return answer;
    }
}