function solution(dartResult) {
    var prev = [0, 0];
    return dartResult.match(/\d+[A-Z]|[*#]/g).reduce((acc, cur, idx) => {
        if(cur === '*') {
            acc -= (prev[0] + prev[1]);
            acc += (prev[0] * 2 + prev[1] * 2);
            [prev[0], prev[1]] = [prev[0] * 2, prev[1] * 2];
        } else if(cur === '#'){
            acc -= prev[1];
            acc += prev[1] * (-1);
            prev[1] = prev[1] * (-1);
        }
        else {
            var [num, alp] = cur.match(/\d+|[A-Z]/g);
            var res = Math.pow(num, alp === 'S' ? 1 : alp === 'D' ? 2 : 3);
            acc += res;
            if(idx === 0) prev[1] = res;
            else [prev[0], prev[1]] = [prev[1], res];
        }
        return acc;
    }, 0);
}