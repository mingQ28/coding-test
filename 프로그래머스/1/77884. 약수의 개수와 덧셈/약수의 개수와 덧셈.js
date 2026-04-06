function solution(left, right) {
    var answer = 0;
    for(let i = left; i <= right; i++){
        var cnt = 0;
        for(let j = 1; j * j <= i; j++){
            if(i % j === 0) cnt += 2;
            if(j * j === i) cnt--;
        }
        cnt % 2 === 0 ? answer += i : answer -= i;
    }
    return answer;
}
// 제곱근이 정수면 약수의 개수가 홀수다
// Number.inInteger(Math.sqrt(i)) 로도 풀수 있음