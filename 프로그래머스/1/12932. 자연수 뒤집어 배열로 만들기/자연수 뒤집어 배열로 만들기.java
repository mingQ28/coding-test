import java.util.*;
class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            // long 타입이니깐 int 형으로 변환필수
            list.add((int)(n%10));
            n /= 10;
        }
        // toArray는 Integer 같은 참조형배열일때 지원
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}