function solution(array, n) {
    return array.reduce((acc, cur) => {
        var a = Math.abs(acc - n);
        var b = Math.abs(cur - n);
        
        if(a > b) return cur;
        if(a === b && acc > cur) return cur;
        
        return acc;
    }, 100);
}