function solution(brown, yellow) {
    var total = brown + yellow;
    for(let i = 1; i * i <= total; i++){
        if((total / i - 2) * (i - 2) === yellow){
            return [total / i, i];
        }
    }
    
}
// 총 면적에서 가로, 세로 각 2개씩 제외 = 노란색 면적