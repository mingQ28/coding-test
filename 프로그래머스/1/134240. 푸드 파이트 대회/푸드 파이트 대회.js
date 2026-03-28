function solution(food) {
    var answer = food.reduce((acc, cur, idx) =>
        idx > 0 ? acc += (idx + '').repeat(Math.floor(cur / 2)) : acc
    , '')
    var reverse = [...answer].reverse().join('');
    
    return answer + '0' + reverse;
}