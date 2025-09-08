class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index_list.length; i++){
            sb.append(answer.charAt(index_list[i]));
        }
        return sb.toString();
    }
}