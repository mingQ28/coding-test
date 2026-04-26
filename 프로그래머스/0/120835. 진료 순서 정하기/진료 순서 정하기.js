function solution(emergency) {
    var sorted = [...emergency].sort((a, b) => b - a);
    var answer = [];
    let i = 0;
    
    for(let em of emergency){
        answer[i++] = sorted.indexOf(em) + 1;
        console.log(sorted.indexOf(em));
    }
    
    return answer;
}