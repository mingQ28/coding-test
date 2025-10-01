import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] str = s.split(" ");
        int sum = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                stack.pop();
            }else{
                stack.push(str[i]);
            }
        }
        // for(int i = 0; i < stack.size(); i++){ // 이렇게 할 경우 pop을 하면서 스택의 사이즈가 줄어듦
        //     sum += Integer.parseInt(stack.pop());
        // }
        int size = stack.size();
        for(int i = 0; i < size; i++){
            sum += Integer.parseInt(stack.pop());
        }
        return sum;
    }
}