function solution(k, score) {
    var hall = []; // 명예의 전당에 오를 점수
    var answer = [];
    for(let s of score){
        hall.push(s); // 먼저 푸쉬한 뒤
        hall.sort((a, b) => b - a); // 내림차순으로 정렬
        
        if(hall.length > k) hall.pop(); // hall의 길이가 k보다 클 경우 pop
        
        answer.push(hall[hall.length - 1]);
    }
    
    return answer;
}