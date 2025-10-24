import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        // A에서 작은 순서대로, B에서는 큰 순서대로 곱하는 방식으로 최솟값
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[B.length - i - 1];
        }
        return sum;
    }
}