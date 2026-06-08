function solution(numbers) {
    var alp = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    for(let i = 0; i < alp.length; i++){
        numbers = numbers.replaceAll(alp[i], i);
    }
    
    return Number(numbers);
}