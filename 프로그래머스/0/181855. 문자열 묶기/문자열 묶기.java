class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for(int i = 0; i < strArr.length; i++){
            count[strArr[i].length()]++;
        }
        int max = 0;
        for(int i = 0; i < 31; i++){
            if(max < count[i])
                max = count[i];
        }
        return max;
    }
}