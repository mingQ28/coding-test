import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] string = my_string.split("");
        Arrays.sort(string);
        String answer = "";
        for(int i = 0; i < string.length; i++){
            answer += string[i];
        }
        return answer;
    }
}