function solution(seoul) {
    var answer = 0;
    seoul.forEach((x, idx) => x === "Kim" ? answer = idx : answer);
    return "김서방은 " + answer + "에 있다"
}
