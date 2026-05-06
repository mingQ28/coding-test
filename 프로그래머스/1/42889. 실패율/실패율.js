function solution(N, stages) {
    var nums = Array(N + 1).fill(0);
    stages.reduce((acc, cur) => { // 스테이지에 도달한 플레이어 수 계산
        for(let i = 1; i <= cur; i++) cur === N + 1 ? acc[i - 1]++ : acc[i]++;
        return acc;
    }, nums); 

    var failed = [];
    for(let i = 1; i < N; i++){ // 실패율 계산 : 이번인덱스 - 다음인덱스= 스테이지 실패
        failed.push((nums[i] - nums[i + 1]) / nums[i]);
    }
    
    var clear = stages.filter(x => x === N + 1).length;
    failed.push((nums[N] - clear) / nums[N]);
    var sorted = failed
        .map((x, idx) => { return {stage : idx + 1, fail : x} } )
        .sort((a, b) => {
            if(a.fail !== b.fail) return b.fail - a.fail;
            return a.stage - b.stage;
        })
    return sorted.map(x => x.stage);
}