const solution = (numbers) => {
    numbers.sort((a, b) => a - b); // 오름차순 정렬
    var left = numbers[0] * numbers[1]; // 오름차순 기준 왼쪽 2개를 곱한 값(가장 작은 값 2개)
    
    numbers.sort((a, b) => b - a); // 내림차순 정렬
    var right = numbers[0] * numbers[1]; // 내림차순 기준 왼쪽 2개를 곱한 값(가장 큰 값 2개)
    return Math.max(left, right);
}