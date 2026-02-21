const solution = (s1, s2) => {
    let sm = s1.length > s2.length; // s1의 길이가 더 크면 true, 아니면 false
    let cnt = 0;
    if(sm){ // 만약 s1의 길이가 더 크다면
        s2.forEach(s => {if(s1.includes(s)) cnt++; })
    }
    else{
        s1.forEach(s => {if(s2.includes(s)) cnt++;})
    }
    return cnt;
}