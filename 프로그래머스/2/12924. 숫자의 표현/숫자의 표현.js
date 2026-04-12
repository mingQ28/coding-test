function solution(n) {
    var cnt = 0;
    for(let i = 1; i * i <= n; i++){
        if(n % i === 0){
            if(i % 2 !== 0) cnt++; // 홀수
            if(Math.sqrt(n) !== i && (n / i) % 2 !== 0) cnt++;
            // 제곱수, 약수 한 쌍에서 다른 수도 홀수인지 판단
        }
    }
    return cnt;
}
// 연속합의 개수 = n의 홀수 약수 개수