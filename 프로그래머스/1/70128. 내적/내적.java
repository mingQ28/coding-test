import java.util.*;
class Solution {
    public int solution(int[] a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < a.length; i++){
            stack.push(a[i] * b[i]);
        }
        int sum = 0;
        for(int st : stack){
            sum += st;
        }
        return sum;
    }
}