function solution(n) {
    var answer = n;
    var ch = answer.toString(2);
    var len = [...String(ch)].filter(x => x === '1').length;
    
    while(true){
        answer++;
        ch = answer.toString(2); // 이진수 변환
        if([...ch].filter(x => x === '1').length === len) break;   
    }
    return answer;
}