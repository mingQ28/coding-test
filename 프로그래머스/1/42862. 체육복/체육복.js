function solution(n, lost, reserve) {
    // 여벌도 있고 도난도 당한 학생 제거
    const overlap = lost.filter(x => reserve.includes(x));
    lost = lost.filter(x => !overlap.includes(x)).sort((a, b) => a - b);
    reserve = reserve.filter(x => !overlap.includes(x)).sort((a, b) => a - b);
    
    var cnt = n - lost.length;
    
    cnt += reserve.reduce((acc, cur) => {
        let target =
            lost.indexOf(cur - 1) !== -1 ? cur - 1 :
            lost.indexOf(cur + 1) !== -1 ? cur + 1 :
            -1;

        if (target !== -1) {
            lost[lost.indexOf(target)] = -1;
            return acc + 1;
        }

        return acc;
    }, 0);
    
    return cnt;
}