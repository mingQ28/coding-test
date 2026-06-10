function solution(park, routes) {
    var sRow, sCol; // 시작점 위치
    park.forEach((x, idx) => {
        if(x.includes('S')){
            sRow = idx;
            sCol = x.indexOf('S');
        }
    })
    
    const dir = { // 방향 
        E: [0, 1],
        W: [0, -1],
        S: [1, 0],
        N: [-1, 0]
    };
    
    routes.forEach(route => {
        var [op, n] = route.split(' ');
        var isOk = true;
        
        let nr = sRow;
        let nc = sCol;
        
        for(let i = 0; i < Number(n); i++){
            nr += dir[op][0];
            nc += dir[op][1];
            
            if(nr < 0 || nr >= park.length 
               || nc < 0 || nc >= park[0].length ){
                isOk = false;
                break;
            }
            if(park[nr][nc] === 'X'){
                isOk = false;
                break;
            }
        }
        if(isOk){
            sRow = nr;
            sCol = nc;
        }
    })
    return [sRow, sCol];
}