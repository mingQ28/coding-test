import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            s = s.substring(1) + s.charAt(0);
            boolean b = false;
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == '[' || c == '(' || c == '{'){
                    stack.push(c);
                    b = false;
                }
                else if(!stack.isEmpty()){
                    char ch = stack.pop();
                    if(c == ']' && ch == '[' 
                       || c == '}' && ch == '{' 
                       || c == ')' && ch == '('){
                        b = true;
                    }
                }
            }
            if(stack.isEmpty() && b){
                count++;
            } 
            stack.clear();
        }
        return count;
    }
}