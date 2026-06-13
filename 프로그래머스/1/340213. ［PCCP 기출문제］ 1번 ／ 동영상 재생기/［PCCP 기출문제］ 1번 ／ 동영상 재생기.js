function solution(video_len, pos, op_start, op_end, commands) {
    var calcTime = time => {
        var [s, m] = time.split(':');
        return Number(s) * 60 + Number(m); 
    }
    
    var endT = calcTime(video_len); // 종료 위치
    var startT = calcTime(pos);  // 시작 위치
    var opStart = calcTime(op_start); // 오프닝 시작 위치
    var opEnd = calcTime(op_end); // 오프닝 종료 위치
    
    commands.forEach(comm => {
        if(startT >= opStart && startT <= opEnd) // 오프닝 구간일 경우 오프닝 종료위치로 이동
            startT = opEnd;
        
        switch(comm){
            case "prev":
                startT -= 10;
                break;
            case "next":
                startT += 10;
                break;
        }
        if(startT < 0) startT = 0; // 0초 이전이 될 경우 0으로 이동
        if(startT > endT) startT = endT; // 종료위치보다 클 경우 종료위치로 이동
        if(startT >= opStart && startT <= opEnd) // 오프닝 구간일 경우 오프닝 종료위치로 이동
            startT = opEnd;
    })
    
    const mm = String(Math.floor(startT / 60)).padStart(2, '0');
    const ss = String(startT % 60).padStart(2, '0');
    
    return `${mm}:${ss}`;
}