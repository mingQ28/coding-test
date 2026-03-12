function solution(numlist, n) {
    numlist.sort((a, b) => {
        if(Math.abs(a - n) === Math.abs(b - n)) // 같다면 큰 수 먼저
            return b - a;
        return Math.abs(a - n) - Math.abs(b - n); // 거리를 절대값으로 비교
    })
    return numlist;
}