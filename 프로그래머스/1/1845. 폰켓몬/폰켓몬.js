function solution(nums) {
    var set = new Set();
    for(let num of nums){
        set.add(num);
    }
    return Math.min(nums.length / 2, set.size);
}