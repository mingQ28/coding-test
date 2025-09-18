class Solution {
    public int solution(String my_string, String is_prefix) {
        int len = is_prefix.length();
        if(my_string.length() >= len && my_string.substring(0, len).equals(is_prefix)){
            return 1;
        }
        return 0;
    }
}