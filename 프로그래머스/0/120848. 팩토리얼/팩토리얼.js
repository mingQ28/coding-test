function solution(n) {
    var sum = 1;
    var i = 1;
    while(true){
        sum *= i;
        if(sum > n) return i - 1;
        i++;
    }
}