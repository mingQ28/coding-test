function solution(n, m, section) {
    var cnt = 0;
    var lastP = 0;
    
    for(let s of section){
        if(s > lastP){
            cnt++;
            lastP = s + m - 1;
        }
    }
    
    return cnt;
}