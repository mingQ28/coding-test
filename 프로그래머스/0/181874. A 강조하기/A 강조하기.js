function solution(myString) {
    return [...myString].map(x => {
        if(x === 'a') return 'A';
        else if(x !== 'A' && x.charCodeAt(0) < 97) return x.toLowerCase();
        else return x;
    }).join('');
}