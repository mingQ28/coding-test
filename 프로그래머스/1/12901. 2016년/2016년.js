function solution(a, b) {
    var week = ["SUN","MON","TUE","WED","THU","FRI","SAT"];
    var month = [31,29,31,30,31,30,31,31,30,31,30,31];
    var sum = b;
    for(let i = 0; i < a - 1; i++){
        sum += month[i];
    }
    return week[(sum + week.indexOf("FRI") - 1) % 7];
}