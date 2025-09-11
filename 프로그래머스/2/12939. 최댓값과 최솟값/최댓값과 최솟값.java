import java.util.*;
class Solution {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(arr).min().orElseThrow();;
        int max=  Arrays.stream(arr).max().orElseThrow();;
        return min + " " + max;
    }
}