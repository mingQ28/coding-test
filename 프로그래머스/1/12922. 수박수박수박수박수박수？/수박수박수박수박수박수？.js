function solution(n) {
    return Array(n).fill(0).map((x, i) => i % 2 === 0 ? "수" : "박").join("");
}