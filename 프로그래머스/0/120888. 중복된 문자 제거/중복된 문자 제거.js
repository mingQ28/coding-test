function solution(my_string) {
    return [...my_string]
        .filter((x, idx) => [...my_string].indexOf(x) === idx)
        .join("");
}
// 현재 글자의 인덱스와 indexOf로 찾은 인덱스의 값이 다르면 중복된 값