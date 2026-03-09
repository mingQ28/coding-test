function solution(n) {
    const cnt = (num) => [...num.toString(2)].filter(x => x === '1').length
    var target = cnt(n);
    var answer = n + 1;
    
    while(cnt(answer) !== target){
        answer++;
    }
    return answer;
}