class Solution {
    public int solution(String[] babbling) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for(int i = 0; i < babbling.length; i++){
            for(String ba : baby){
                if(babbling[i].contains(ba)){ // 만약 일치하는 문자열이 있다면
                    babbling[i] = babbling[i].replace(ba, "!"); // !으로 변환
                    // wyeoo의 경우, 공백으로 처리할 시 ye => ''이 되면서 woo가 되어서 나중에 카운트에 포함됨
                }
            }
            babbling[i] = babbling[i].replace("!", ""); 
        }
        for(String ba : babbling){
            if(ba.equals(""))
                count++;
        }
        return count;
    }
}