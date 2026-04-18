function solution(n) {
    var answer = [];
    var a = 0;
    console.log(answer);
    for(let i = 0; i < n; i++){
        var res = [];
        for(let j = 0; j < n; j++){
            j === a ? res.push(1) : res.push(0);
        }
        a++;
        answer.push(res);
    }
    
    return answer;
}