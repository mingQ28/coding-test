function solution(k, tangerine) {
    var arr = {};
    
    for(let tan of tangerine){
        arr[tan] = (arr[tan] || 0) + 1;
    }
    
    const sorted = Object.values(arr) // 객체는 정렬 못해서 배열로 변환필요
        .sort((a, b) => b - a);
    
    var sum = 0;
    for(let i = 0; i < sorted.length; i++){
        sum += sorted[i];
        
        if(sum >= k) return i + 1;
    }
}