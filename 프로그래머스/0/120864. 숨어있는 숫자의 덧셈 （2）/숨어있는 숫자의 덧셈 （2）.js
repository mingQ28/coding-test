function solution(my_string) {
    var num = my_string.replace(/[A-Za-z]/g, " ").split(" ");
    return num.length === 0 ? 0 : num.reduce((acc, cur) => acc += Number(cur), 0);
}