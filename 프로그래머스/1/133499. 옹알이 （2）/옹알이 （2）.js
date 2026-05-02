function solution(babbling) {
    return babbling.filter(x => 
        /^(aya|ye|woo|ma)+$/.test(x) && // 발음조합인지
        !/(aya|ye|woo|ma)\1/.test(x)  // 연속된건지
    ).length;
}