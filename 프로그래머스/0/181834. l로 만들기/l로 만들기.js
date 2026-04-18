function solution(myString) {
    return [...myString].map(x => x < 'l' ? 'l' : x).join('');
}