function solution(s, skip, index) {
    var skipCode = [...skip].map(x => {
        return x.charCodeAt(0);
    })
    
    return [...s].map(x => {
        var code = x.charCodeAt(0);
        var cnt = 0;
        while(cnt < index){
            code++;
            code = code > 122 ? 97 : code;
            if(!skipCode.includes(code)) cnt++;
        }
        return String.fromCharCode(code);
    }).join('');
}