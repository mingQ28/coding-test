const solution = (numbers) => {
    numbers.sort( (a, b) => a - b); // 오름차순 정렬
    return numbers[numbers.length - 1] * numbers[numbers.length - 2];
}