function solution(n, m) {
    var val = gcd(n, m);
    return [val, (n * m) / val];
}

function gcd(a, b){ // 최대공약수
    if(a < b) {
        var tmp = a;
        a = b;
        b = tmp;
    }
    
    while(b != 0){
        var re = a % b;
        a = b;
        b = re;
    }
    
    return a;
}
