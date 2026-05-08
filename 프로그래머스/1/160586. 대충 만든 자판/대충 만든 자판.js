function solution(keymap, targets) {
    var map = new Map();
    keymap.reduce((acc, cur) => {
        [...cur].forEach((x, idx) => {
            if(map.has(x)){
                map.set(x, Math.min(map.get(x), idx));
            }
            else map.set(x, idx);
        })
    }, map);
    return targets.map(target => {
        var cnt = 0;
        
        for(let ta of target){
            if(!map.has(ta)) return -1;
            cnt += map.get(ta) + 1;
        }
        return cnt;
    })
}