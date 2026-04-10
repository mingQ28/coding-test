function solution(n) {
    var sum = 0;
    
    if(n % 2 === 0){
        for(let i = 0; i <= n; i += 2){
            sum += i ** 2;
        }
    }else {
        for(let i = 1; i <= n; i += 2){
            sum += i;
        }
    }
    
    return sum;
}