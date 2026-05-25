function solution(X, Y) {
    var arrX = Array(10).fill(0), arrY = Array(10).fill(0);
    [...X].forEach(a => arrX[a]++);
    [...Y].forEach(a => arrY[a]++);
    
    var answer = [];
    for(let i = 9; i >= 0; i--){
        var min = Math.min(arrX[i], arrY[i]);
        
        answer.push(String(i).repeat(min));
    }
    answer = answer.join('');
    return answer === '' ? '-1' : answer[0] === '0' ? '0' : answer;
}