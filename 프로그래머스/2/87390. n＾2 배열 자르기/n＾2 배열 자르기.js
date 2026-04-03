function solution(n, left, right) {
    var answer = [];
    for(let i = left; i <= right; i++){
        // 1차원 인덱스 -> 2차원으로 변환
        var a = parseInt(i / n); // 행의 위치
        var b = i % n; // 열의 위치
        answer.push(Math.max(a, b) + 1);
    }
    return answer;
}