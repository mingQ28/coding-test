function solution(priorities, location) {
    var que = priorities.map((x, idx) => ({x, idx}));
    var cnt = 0;
    
    while(que.length > 0){
        var { x, idx } = que.shift();
        
        if(que.filter(({ x : x2 }) => x2 > x).length === 0) {
            cnt++;
            
            if(idx === location)
            return cnt;
        }
        else que.push({x, idx});
        
    }
   
}