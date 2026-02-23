const solution = (n) => {
    var arr = []
    for(let i = 1; i <= n; i += 2){
        arr = [...arr, i];
    }
    return arr;
}
