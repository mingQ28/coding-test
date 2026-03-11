function solution(numer1, denom1, numer2, denom2) {
    const gcd = (num1, num2) => num2 === 0 ? num1 : gcd(num2, num1 % num2); // 최대공약수
     
    const lcm = denom1 * denom2 / gcd(denom1, denom2); // 최소공배수
    
    const numer = (lcm / denom1) * numer1 + (lcm / denom2) * numer2;
    
    const g = gcd(numer, lcm); // 2/4와 같은 경우가 발생할 시 약분 필요
    
    return [numer / g, lcm / g];
}