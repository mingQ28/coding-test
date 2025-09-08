class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String strF = "*".repeat(len - 4);
        String strB = phone_number.substring(len - 4, len);
        return strF + strB;
    }
}