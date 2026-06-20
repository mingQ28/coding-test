function solution(common) {
    var isDiff = common[1] - common[0] === common[2] - common[1] ? true : false; // 등차면 true, 등비면 false
    
    if(isDiff){
        return common.at(-1) * 2 - common.at(-2);
    } else {
        return Math.pow(common.at(-1), 2) / common.at(-2);
    }
}