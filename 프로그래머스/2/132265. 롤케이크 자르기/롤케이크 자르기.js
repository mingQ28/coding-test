function solution(topping) {
    var left = new Set(); // {1, 2, 3}
    var right = new Map(); // { 1: 2, 3: 1}
    var cnt = 0;
    
    topping.forEach(x => { 
        right.set(x, (right.get(x) || 0) + 1);
    })
    
    topping.forEach(x => {
        left.add(x); // 왼쪽에 하나씩 추가
        right.set(x, right.get(x) - 1); // 오른쪽 하나씩 제거
        
        if(right.get(x) === 0) right.delete(x);
        if(left.size === right.size) cnt++; // 왼쪽, 오른쪽 사이즈가 같으면 공평하게 나눔
    })
    return cnt;
}