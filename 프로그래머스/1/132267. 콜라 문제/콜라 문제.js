function solution(a, b, n) {
    var cnt = 0;
    var num = n;
    while(num >= a){
        var tmp = Math.floor(num / a) * b;
        cnt += tmp;
        num = tmp + (num % a);
    }
    
    return cnt;
}