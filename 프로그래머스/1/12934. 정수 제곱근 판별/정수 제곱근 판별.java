class Solution {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        if(answer * answer == n) // 제곱근 판별을 위해
            return (answer + 1) * (answer + 1);
        return -1;
    }
}