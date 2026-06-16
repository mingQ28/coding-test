function solution(n, w, num) {
    var row = Math.ceil(num / w);
    var col; // 짝수 : 오 -> 왼, 홀수 : 왼 -> 오
    if(row % 2 === 0){
        col = w - ((num - 1) % w);
    }else{
        col = ((num - 1) % w) + 1;
    }
    
    var totalRow = Math.ceil(n / w); // 행의 총 개수
    var remain = n % w; // 맨 위에 남은 개수
    if(remain === 0) remain = w;
    
    var hasTop = false;
    
    if(totalRow % 2 === 0){
        hasTop = col > w - remain;
    }else{
        hasTop = col <= remain;
    }
    
    return totalRow - row + (hasTop ? 1 : 0);
}