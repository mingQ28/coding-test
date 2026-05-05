function solution(nums) {
    var cnt = 0;
    for(let i = 0; i < nums.length - 2; i++){
        for(let j = i + 1; j < nums.length - 1; j++){
            for(let k = j + 1; k < nums.length; k++){
                var sum = nums[i] + nums[j] + nums[k];
                var isDe = true;
                for(let a = 2; a < sum; a++){
                    if(sum % a === 0){
                        isDe = false;
                        break;
                    }
                }
                isDe ? cnt++ : cnt;
            }
        }
    }
    return cnt;
}