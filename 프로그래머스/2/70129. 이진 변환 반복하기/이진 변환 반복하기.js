function solution(s) {
    var answer = [0, 0];
    while(parseInt(s, 2) !== 1){ // 2진수->10진수의 결과가 1이면 break
        answer[1] += [...s].filter(x => x === '0').length; // 먼저 0의 개수 카운트
        s = [...s].filter(x => x === '1').length.toString(2); // 그 다음 1의 개수 카운트 후 2진수로 변환
        answer[0]++;
    }
    return answer;
}