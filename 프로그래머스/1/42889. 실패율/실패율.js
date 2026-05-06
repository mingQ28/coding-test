function solution(N, stages) {
    var arr = [];
    
    for(let i = 1; i <= N; i++){
        var reach = stages.filter(x => x >= i).length;
        var cur = stages.filter(x => x === i).length;
        arr.push([i, cur / reach]);
    }
    
    arr.sort((a, b) => b[1] - a[1]);
    return arr.map(x => x[0]);
}