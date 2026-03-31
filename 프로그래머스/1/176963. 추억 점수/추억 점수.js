function solution(name, yearning, photo) {
    var scores = {};
    var answer = [];
    
    for(let i = 0; i < name.length; i++){
        scores[name[i]] = yearning[i];
    }
    
    for(let ph of photo){
        answer.push(ph.reduce((acc,cur) => acc += scores[cur] ?? 0, 0));
    }
    
    return answer;
}
// scores[cur] ?? 0 : scores[cur]의 값이 없을경우, undefined가 되면서 acc가 제대로 누적을 못함 -> ?? 을 통해 undefined일 경우 0으로 변환하는 과정 추가