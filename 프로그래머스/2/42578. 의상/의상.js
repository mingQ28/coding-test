function solution(clothes) {
    var answer = 1;
    var map = {};
    for(let cloth of clothes){
        map[cloth[1]] = map[cloth[1]] ?? []; // 맵에 종류가 저장되지 않았다면 빈 배열 생성
        map[cloth[1]].push(cloth[0]);
    }
    
    for(let [k, v] of Object.entries(map)){ // map은 객체라서 of map으로 사용못함
        answer *= (v.length + 1);
    }
    
    return answer - 1;
}