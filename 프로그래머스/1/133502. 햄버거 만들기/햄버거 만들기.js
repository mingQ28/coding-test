function solution(ingredient) {
    var arr = [];
    var cnt = 0;
    
    for(let ing of ingredient){
        arr.push(ing);
        if(arr.slice(-4).join('') === "1231"){
            cnt++;
            arr.splice(-4);
        }
    }
    return cnt;
}