function solution(my_string) {
    var answer = Array(52).fill(0);
    return [...my_string].reduce((acc, cur) => {
        var code = cur.charCodeAt(0);
        if(code >= 65 && code <= 90) // 대문자
            acc[code - 65]++;
        else if(code >= 97 && code <= 122) // 소문자 
            acc[code - 97 + 26]++;
        return acc;
    }, answer);
}