function solution(s) {
    return s.split(" ").map(x => x.split("").map((y, idx) => idx % 2 === 0 ? y.toUpperCase() : y.toLowerCase()).join("")).join(" ");
}