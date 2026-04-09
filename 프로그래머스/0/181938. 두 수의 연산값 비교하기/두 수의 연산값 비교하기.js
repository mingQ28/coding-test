function solution(a, b) {
    return (a + '' + b) >= 2 * a * b ? Number(a + '' + b) : 2 * a * b;
}