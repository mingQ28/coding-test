const solution = (hp) => {
    var answer = 0;
    
    answer += Math.trunc(hp / 5); // 장군개미
    hp %= 5;
    
    answer += Math.trunc(hp / 3); // 병정개미
    hp %= 3;
    
    answer += hp; // 일개미
    
    return answer;
}