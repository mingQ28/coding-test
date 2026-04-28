function solution(array) {
    return array.reduce((acc, cur) => acc += [...String(cur)].filter(x => x === '7').length, 0);
}