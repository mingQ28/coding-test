function solution(bandage, health, attacks) {
    var cnt = 0;
    var a = 0;
    var curHeal = health;
    for(let i = 1; i <= attacks[attacks.length - 1][0]; i++){
        if(i === attacks[a][0]){ // 공격받을 경우
            curHeal -= attacks[a++][1];
            cnt = 0;
        } else{ // 아닐 경우, 초당 회복 & 시전 시간 카운트
            curHeal += bandage[1];
            cnt++;
        }
        
        if(cnt === bandage[0]){ // 회복 시전을 완료할 경우
            curHeal += bandage[2];
            cnt = 0;
        }
        if(curHeal < 0) return -1; // 0 이하면 -1 리턴
        curHeal = curHeal > health ? health : curHeal; // 최대체력인
    }
    return curHeal > 0 ? curHeal : -1;
}