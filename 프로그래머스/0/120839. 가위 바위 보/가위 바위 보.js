const solution = (rsp) => {
    const arr = [
        ["2", "0"],
        ["0", "5"],
        ["5", "2"]
    ];
    var answer = ''
    rsp.split('').map(x => {
        return arr.map(y => x === y[0] ? answer += y[1] : answer);
    })
    return answer;
}