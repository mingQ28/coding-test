function solution(n) {
    var cnt = 0;
    var i = 1;
    while(cnt < n){
        if(i % 3 !== 0 && !String(i).includes("3"))
            cnt++;
        i++;
    }
    return i - 1;
}