import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean b = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size() > 0 ? false : true;
    }
}