const solution = (cipher, code) => {
    var answer = '';
    for(let i = 1; i <= cipher.length && i * code <= cipher.length; i++){
        answer += cipher.at(i * code - 1);
    }
    return answer;
}