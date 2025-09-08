import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        for(long i = 1; i <= n; i++){
            long a = (long)(x * i);
            list.add(a);
        }
        long[] arr = new long[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}