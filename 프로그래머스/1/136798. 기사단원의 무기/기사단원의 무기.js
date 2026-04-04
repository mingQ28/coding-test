function solution(number, limit, power) {
    var sum = 0;
    for(let i = 1; i <= number; i++){
        var cnt = 0;
        for(let j = 1; j * j <= i; j++){ 
            if(i % j === 0) {
                cnt += 2; // 약수는 항상 쌍으로 존재하지만
                if (j * j === i) cnt--; // 제곱수일 때는 하나만 카운트
            }
        }
        sum += cnt > limit ? power : cnt;
    }
    return sum;
}
// 약수문제는 루트n 기억하기