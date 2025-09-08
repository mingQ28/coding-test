import java.util.*;
class Solution {
    public String solution(String s) {
        String[] string = s.split("");
        // 정렬은 기본적으로 오름차순이라 내림차순으로 설정필요
        Arrays.sort(string, Collections.reverseOrder());
        return String.join("", string);
    }
}