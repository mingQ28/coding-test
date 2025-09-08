class Solution {
    public int solution(String myString, String pat) {
        String answer = myString;
        answer = answer.replace("A", "C").replace("B", "A").replace("C", "B");
        return answer.contains(pat) ? 1 : 0;
    }
}