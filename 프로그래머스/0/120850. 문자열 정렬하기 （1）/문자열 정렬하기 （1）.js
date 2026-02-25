const solution = (my_string) => {
    return [...my_string]
        .filter(x => Number.isInteger(Number(x))) // 숫자인지 판단 후
        .map(x => Number(x)) // 문자열을 숫자형으로 변환
        .sort((a, b) => a - b); // 오름차순 정렬
}