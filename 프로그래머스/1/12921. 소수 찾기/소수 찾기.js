function solution(n) {
    const prime = Array(n + 1).fill(true);
    prime[0] = false;
    prime[1] = false; // 0, 1은 소수 아님
    
    for(let i = 2; i * i <= n; i++){
        for(let j = i * i; j <= n; j += i){
            prime[j] = false; // 배수는 제거
        }
    }
    
    return prime.filter(x => x === true).length;
}
// 에라토스테네스의 체 : 소수 구하는 알고리즘
// 먼저 0 ~ n 까지 담긴 배열을 만든 후 처음엔 모두 소수(true)라고 가정
// 2부터 시작해서 아직 지워지지 않은 가장 작은수를 소수라고 가정하고
// 그 수의 배수부터 차근차근 지워가는 방식