class Solution {
    public int solution(int n) {
        // 피보나치 수열을 반복문으로 계산 (재귀는 중복 계산으로 인해 시간 초과 발생)
        int sum = 0; 
        int a = 0;     // F(0)
        int b = 1;     // F(1)

        // F(0)=0, F(1)=1은 이미 설정되어 있으므로 2번째 항부터 n번째 항까지 계산
        for (int i = 2; i <= n; i++) {
            // 매번 더할 때마다 1234567로 나머지를 구해 int 범위 초과 방지 및 문제 조건 충족
            sum = (a + b) % 1234567;

            a = b;     // 이전 항을 한 칸 전진 (F(i-1) -> F(i-2))
            b = sum;   // 새로 구한 값을 F(i-1)로 사용
        }
        return sum;
    }
}
