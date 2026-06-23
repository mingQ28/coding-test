function solution(numbers) {
    var stack = [];
    var answer = Array(numbers.length).fill(-1);
    
    for(let i = 0; i < numbers.length; i++){
        while(stack.length && numbers[stack.at(-1)] < numbers[i]){
            var idx = stack.pop();
            answer[idx] = numbers[i];
        }
        stack.push(i);
    }
    return answer;
}