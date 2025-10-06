import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> hash = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < want.length; i++){
            hash.put(want[i], number[i]);
        }
        for(int i = 0; i <= discount.length - 10; i++){
            HashMap<String, Integer> count = new HashMap<>();
            for(int j = i; j < i + 10; j++){
                count.put(discount[j], count.getOrDefault(discount[j], 0) + 1);
            }
            if(hash.equals(count)){
                answer++;
            }
        }
        return answer;
    }
}