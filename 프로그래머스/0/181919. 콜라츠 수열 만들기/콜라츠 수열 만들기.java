import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int a = n;
        list.add(a);
        while(a != 1){
            a = a % 2 == 0 ? a / 2 : 3 * a + 1;
            list.add(a);
        }
        int[] toArr = list.stream().mapToInt(i -> i).toArray();
        return toArr;
    }
}