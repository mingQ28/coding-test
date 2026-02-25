const solution = (my_string, num1, num2) => {
    var arr = [...my_string];
    
    [arr[num1], arr[num2]] = [arr[num2], arr[num1]];
    return arr.join('');
}
// arr[num1] = arr[num2] 
// arr[num2] = arr[num1] => 이렇게 하면 값이 덮여지는데 구조분해 할당으로 하면 안전
// 구조분해 할당 : 오른쪽을 먼저 계산 후, 왼쪽에 대입하는 방식이라 덮여지지 않음