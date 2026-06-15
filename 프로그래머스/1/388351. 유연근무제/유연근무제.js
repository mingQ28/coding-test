function solution(schedules, timelogs, startday) {
    var ans = 0;
    
    var calcTime = time => {
        let h = Math.floor(time / 100);
        let m = time % 100;
        
        m += 10;
        
        if(m >= 60){
            m -= 60;
            h += 1;
        }
        
        return h * 100 + m;
    }
    
    for(let i = 0; i < schedules.length; i++){
        var limitT = calcTime(schedules[i]); 
        var success = true;
        var day = startday;
        
        for(let j = 0; j < 7; j++){
            if(day !== 6 && day !== 7){
                if (timelogs[i][j] > limitT ) {
                    success = false;
                    break;
                }
            }
            day = day === 7 ? 1 : day + 1;
        }
        if(success) ans++;
    }
    return ans;
}