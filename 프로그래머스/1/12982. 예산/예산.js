function solution(d, budget) {
    var answer = 0;
    d.sort((a, b) => a - b); // 정렬을 한 뒤
    d.forEach((a, idx) => {
        if(budget >= a){ // 예산에서 신청 금액씩 제거
            budget -= a;
            answer++
        }
    })
    return answer;
}