function solution(s, n) {
    return [...s].map(x => {
        if(x === ' ') return x;
        
        var code = x.charCodeAt(0);
        var val = code + n;
        if(code >= 65 && code <= 90) val = val > 90 ? val- 26 : val;
        else if(code >= 97 && code <= 122) val = val > 122 ? val - 26 : val;
        return String.fromCharCode(val);
    }).join('');
}