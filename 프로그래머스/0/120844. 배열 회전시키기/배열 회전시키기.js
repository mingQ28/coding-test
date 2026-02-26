function solution(numbers, direction) {
    if(direction === "left"){
        return [...numbers.slice(1), numbers[0]];
    }else{
        return [numbers[numbers.length - 1], ...numbers.slice(0, -1)];
    }
}
// slice(1) : 첫번째 요소 제외