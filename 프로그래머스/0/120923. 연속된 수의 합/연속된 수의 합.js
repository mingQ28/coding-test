function solution(num, total) {
    var start = total / num - (num - 1) / 2;
    return Array(num).fill(0).map(() => start++);
}