function solution(answers) {
    var arr = Array(3).fill(0);
    var ans = [];
    var p1 = [1, 2, 3, 4, 5];
    var p2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    answers.reduce((acc, cur, idx) => {
        cur === p1[idx % p1.length] ? acc[0]++ : acc;
        cur === p2[idx % p2.length] ? acc[1]++ : acc;
        cur === p3[idx % p3.length] ? acc[2]++ : acc;
        return acc;
    }, arr);
    
    arr.forEach((x, idx) => Math.max(...arr) === x ? ans = [...ans, idx + 1] : ans);
    
    return ans;
}