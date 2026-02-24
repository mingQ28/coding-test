const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const n = Number(input[0]);
    let answer = '';
    for(let i = 1; i <= n; i++){
        answer += '*'.repeat(i) + '\n';
    }
    console.log(answer);
});
// Node.js에서 표준 입력을 받는 방법