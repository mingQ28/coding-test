const solution = (numbers, num1, num2) => {
    return numbers.slice(num1, num2 + 1);
}
// slice(a, b) : a ~ b-1 인덱스까지 자르기(원본은 그대로)
// splice(a, b) : a부터 b개의 인덱스를 삭제(원본에서도 삭제됨)
