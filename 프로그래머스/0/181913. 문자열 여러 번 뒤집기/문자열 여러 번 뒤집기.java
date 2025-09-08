class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        int len = queries.length;
        String answer = my_string;
        for(int i = 0; i < len; i++){
            // 뒤집기 전의 문자열
            String before = answer.substring(queries[i][0], queries[i][1] + 1);
            // 문자열을 sb에 저장해서 reverse
            sb.append(before);
            String change = sb.reverse().toString();
            sb.setLength(0);
            // 뒤집기 전의 문자열을 뒤집은 문자열로 replace
            // 처음에 이렇게 했는데 before에 해당하는 모든 문자열도 같이 replace 되어버림
            //answer = answer.replace(before, change);
            
            // 개별로지만 substring을 통해 answer 문자열 정의? 생성? 재정의
            answer = answer.substring(0, queries[i][0]) + change + answer.substring(queries[i][1] + 1, my_string.length());
        }
        return answer;
    }
}