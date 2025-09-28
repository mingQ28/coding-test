// stack 없이 해결
// class Solution {
//     public int[] solution(int[] prices) {
//         int[] arr = new int[prices.length];
//         for(int i = 0; i < prices.length; i++){
//             for(int j = i + 1; j < prices.length; j++){
//                 arr[i]++;
//                 if(prices[i] > prices[j]){
//                     break;
//                 }
//             }
//         }
//         return arr;
//     }
// }
// 스택
// 어려운디;;;
// 
import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){ 
                int idx = stack.pop();
                array[idx] = i - idx;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int idx = stack.pop();
            array[idx] = prices.length - 1 - idx;
        }
        return array;
    }
}