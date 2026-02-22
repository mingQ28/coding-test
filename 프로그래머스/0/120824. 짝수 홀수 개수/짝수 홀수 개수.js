function solution(num_list) {
    var a = num_list.reduce((acc, cur) => cur % 2 === 0 ? acc + 1 : acc , 0); // 짝수 계산
    var b = num_list.reduce((acc, cur) => cur % 2 !== 0 ? acc + 1 : acc, 0); // 홀수 계산
    return [a, b];
}