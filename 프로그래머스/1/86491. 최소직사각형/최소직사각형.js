function solution(sizes) {
    var w = -1, h = -1;
    sizes.map(x => {
        if(x[0] < x[1])
            [x[0], x[1]] = [x[1], x[0]];
    })
    
    sizes.forEach(x => {
        if(x[0] > w) w = x[0];
        if(x[1] > h) h = x[1];
    })
    
    
    return w * h;
}
// 명함이 회전할 수 있음 -> 큰 값을 왼쪽으로 정렬한 뒤 그 값을 기준으로 배열을 다시 정렬