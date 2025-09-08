class Solution {
    public boolean solution(String s) {
        boolean b = s.length() == 4 || s.length() == 6 ? true : false;
        if(b){
            for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
              s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                return false;
            }
        }
        }
        return b;
    }
}