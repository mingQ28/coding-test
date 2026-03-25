function solution(array, commands) {
    var answer = [];
    commands.forEach((arr) => {
        var sorted = array
            .slice(arr[0] - 1, arr[1])
            .sort((a, b) => a - b);
        answer.push(sorted[arr[2] - 1]);
    })
    return answer;
}