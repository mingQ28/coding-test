function solution(age) {
    const alphabet = Array(10)
      .fill(0)
      .map((_, i) => String.fromCharCode(97 + i));
    
    return [...String(age)].map(x => alphabet.at(x)).join("");
    
}