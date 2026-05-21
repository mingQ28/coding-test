function solution(arr) {
    return arr.reduce((acc, cur) => lcm(acc, cur)); // 두 수의 최소공배수를 계산하면서 누적하는 방식
}

const gcd = (a, b) => { // 최대공약수
    while(b !== 0){
        [a, b] = [b, a % b];
    }
    return a;
}

const lcm = (a, b) => a * b / gcd(a, b); // 최소공배수