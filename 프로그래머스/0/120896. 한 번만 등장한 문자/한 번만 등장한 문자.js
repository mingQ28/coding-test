function solution(s) {
    return [...s].filter(x => s.indexOf(x) === s.lastIndexOf(x))
                .sort()
                .join("");
}