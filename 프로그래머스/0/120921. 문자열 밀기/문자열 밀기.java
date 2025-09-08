class Solution {
    public int solution(String A, String B) {
        String str1 = A;
        if(A.equals(B)) // A와 B가 같으면 0 리턴
            return 0;
        for(int count = 1; count <= A.length(); count++){
            String str2 = "";
            str2 += str1.charAt(A.length() - 1);
            for(int i = 0; i < A.length() -1; i++){
                str2 += str1.charAt(i);
            }
            if(B.equals(str2)) // B와 밀린 문자열이 같으면 count 리턴
                return count;
            str1 = str2;
        }
        // 밀린 문자열과 B가 일치하지 않은 채로 while문을 빠져나오면 -1 리턴
        return -1;
    }
}