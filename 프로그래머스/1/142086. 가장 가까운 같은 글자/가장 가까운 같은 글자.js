function solution(s) {
    let map = {};
    var answer = [];

    for(let i = 0; i < s.length; i++){
        let cur = s[i];
        
        if(map[cur] === undefined)
            answer.push(-1);
        else
            answer.push(i - map[cur]);
        
        map[cur] = i
    }
    
    return answer;
}