function solution(emergency) {
    var sorted = [...emergency].sort((a, b) => b - a);
    return emergency.map(x => sorted.indexOf(x) + 1);
}