function solution(arr) {
    var sortArr = [...arr].sort((a, b) => a - b);
    
    return arr.length === 1 ? [-1] : arr.filter(x => x !== sortArr[0]);
}
// sort() : 기본적으로 문자열 비교, ["1", "10"] => ["10", "1"]