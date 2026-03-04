const solution = (s) => {
    var arr = s.split(" ");
    var answer = '';
    for(let i = 0; i < arr.length; i++){
        answer += arr[i].slice(0, 1).toUpperCase() + arr[i].slice(1).toLowerCase();
        if(i !== arr.length - 1) answer += " ";
    }
    return answer;
}