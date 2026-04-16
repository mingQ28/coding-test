function solution(myStr) {
    myStr = myStr.replaceAll('a', ' ') 
        .replaceAll('b', ' ')
        .replaceAll('c', ' ');
    if(myStr.trim() === '')
        return ["EMPTY"];
    return myStr.split(' ').filter(x => x !== '');
}