class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String result = "";
        for(int i = 0; i < myString.length(); i++){
            answer += myString.charAt(i);
            if(answer.contains(pat)){
                result += answer;
                answer = "";
            }
        }
        return result;
    }
}