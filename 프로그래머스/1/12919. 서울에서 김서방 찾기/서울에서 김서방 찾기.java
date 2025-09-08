import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        // indexOf를 arraylist에서만 지원하기 때문에 list 변환 후 indexOf
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + idx + "에 있다";
    }
}