class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int a = 0, b = 0;
        for(int i = 0; i < str1.length() * 2; i++){
            if(i % 2 == 0)
                sb.append(str1.charAt(a++));
            else
                sb.append(str2.charAt(b++));
        }
        return sb.toString();
    }
}