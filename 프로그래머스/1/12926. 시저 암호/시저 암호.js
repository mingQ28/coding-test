function solution(s, n) {
    return [...s].map(x => {
        if(x === ' ') return x;
        
        var code = x.charCodeAt(0);
        var base = code >= 97 ? 97 : 65; // 대소문자 구별하기 위해
        
        return String.fromCharCode((code + n - base) % 26 + base);
    }).join('');
}