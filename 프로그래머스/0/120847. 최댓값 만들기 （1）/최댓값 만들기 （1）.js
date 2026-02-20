const solution = (numbers) => {
    numbers.sort( (a, b) => b - a); // 오름차순 정렬
    return numbers[0] * numbers[1];
}