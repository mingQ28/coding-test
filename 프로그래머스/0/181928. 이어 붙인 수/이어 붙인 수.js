function solution(num_list) {
    var even = 0;
    var odd = 0;
    
    num_list.forEach(x => x % 2 === 0 ? even = even * 10 + x : odd = odd * 10 + x);
    
    return even + odd;
}