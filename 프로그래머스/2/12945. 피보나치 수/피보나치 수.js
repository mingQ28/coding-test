function solution(n) {
    var a = 0, b = 1;
    var answer = 0;
    
    for(let i = 2; i <= n; i++){
        answer = (a + b) % 1234567;
        
        a = b;
        b = answer;
    }
    
    return answer;
}