function solution(array) {
    var res = array.reduce((acc, cur) => { 
        acc[cur] = (acc[cur] || 0) + 1;
        return acc;
    }, {});
    
    var max = Math.max(...Object.values(res));
    var answer = Object.entries(res).filter(([k, v]) => v === max);
    return answer.length > 1 ? -1 : Number(answer[0][0]);
}
