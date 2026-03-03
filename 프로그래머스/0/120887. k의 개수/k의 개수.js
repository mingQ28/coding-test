function solution(i, j, k) {
    var cnt = 0;
    for(let a = i; a <= j; a++){
        [...String(a)].forEach(x => x === String(k) ? cnt += 1 : cnt);
    }
    return cnt;
}