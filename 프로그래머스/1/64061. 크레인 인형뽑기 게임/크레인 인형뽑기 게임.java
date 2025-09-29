import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) { // board는 격자에서 가로줄 기준으로 작성된것
        Stack<Integer> stack = new Stack<>(); // 바구니
        int cnt = 0; // 사라진 인형 개수
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                int cur = board[j][moves[i] - 1];
                if(cur != 0){ // board[][]의 값이 0이 아니면
                    if(!stack.isEmpty() && stack.peek() == cur){ // 빈 스택이 아니고 동일한 값이 연달아 나오면 삭제
                        stack.pop();
                        cnt += 2;
                        board[j][moves[i] - 1] = 0;
                    }else{
                        stack.push(cur); // stack에 push 후 반복문 종료
                        board[j][moves[i] - 1] = 0;
                    }
                    break;
                }
                
            }
        }
        return cnt;
    }
}