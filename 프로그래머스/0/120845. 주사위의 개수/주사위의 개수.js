function solution(box, n) {
    return box.reduce((acc, cur) => acc *= Math.trunc(cur / n), 1);
}