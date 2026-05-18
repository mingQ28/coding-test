function solution(people, limit) {
    var sorted = people.sort((a, b) => a - b);
    var left = 0, right = sorted.length - 1;
    var cnt = 0;
    while(left <= right){
        if(sorted[left] + sorted[right] <= limit){
            left++; right--;
        }else right--;
        cnt++;
    }
    
    return cnt;
}