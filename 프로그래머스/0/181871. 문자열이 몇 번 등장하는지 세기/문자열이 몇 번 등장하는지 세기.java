class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int idx = myString.indexOf(pat, 0);
        while(idx != -1){
            count++;
            idx = myString.indexOf(pat, idx + 1);
        }
        return count;
    }
}