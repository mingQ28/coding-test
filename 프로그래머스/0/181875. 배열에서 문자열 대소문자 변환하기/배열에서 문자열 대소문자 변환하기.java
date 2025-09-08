class Solution {
    public String[] solution(String[] strArr) {
        String[] str = strArr;
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                str[i] = str[i].toLowerCase();
            }else{
                str[i] = str[i].toUpperCase();
            }
        }
        return str;
    }
}