function solution(lottos, win_nums) {
    lottos.sort((a, b) => a - b);
    win_nums.sort((a, b) => a - b);
    
    var zeroCnt = lottos.filter(x => x === 0).length;
    var minCnt = lottos.filter(x => win_nums.includes(x)).length;
    
    return [ranking(zeroCnt + minCnt), ranking(minCnt)];
    
}

const ranking = a => {
    switch(a){
        case 6:
            return 1;
        case 5:
            return 2;
        case 4:
            return 3;
        case 3: 
            return 4;
        case 2:
            return 5;
        default:
            return 6;
    }
}
    