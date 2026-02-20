const solution = numbers => {
    return numbers.reduce((acc, num) => acc += num) / numbers.length;
}
// reduce : 누적 합 계산