function solution(a, b, c, d) {
    var map = new Map();
    
    [a, b, c, d].forEach(x => {
        map.set(x, (map.get(x) || 0) + 1);
    })
    
    const counts = [...map.values()].sort((a, b) => b - a);

    if(counts[0] === 4){
        return 1111 * a;
    }
    
    if(counts[0] === 3){
        let p, q;
        for (const [num, cnt] of map) {
            if (cnt === 3) p = num;
            if(cnt === 1) q = num;
        }
        return Math.pow((10 * p) + q, 2);
    }
    
    if(counts[0] === 2 && counts[1] === 2){
        const nums = [...map.keys()];
        return (nums[0] + nums[1]) * Math.abs(nums[0] - nums[1]);
    }
    
    if (counts[0] === 2){
        let p;
        const others = [];

        for (const [num, cnt] of map) {
            if (cnt === 2) p = num;
            else others.push(num);
        }

        return others[0] * others[1];
    }
        
        
    return Math.min(a, b, c, d);
}