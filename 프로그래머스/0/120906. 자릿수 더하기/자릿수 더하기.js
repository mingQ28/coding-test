function solution(n) {
    var sum = 0;
    while(n){
        sum += n % 10;
        n = Math.trunc(n / 10);
    }
    return sum;
}