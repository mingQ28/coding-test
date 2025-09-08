import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String string = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'x'){ // x를 만나면 만나기 전까지 추가한 문자열을 리스트에 추가하고 초기화
                if(!string.equals(""))
                    list.add(string);
                string = "";
            }else{ // x를 만나지 않는다면 문자열에 해당 문자 추가
                string += ch;
            }
        }
        if(!string.equals("")){ // 마지막 문자가 x가 아닐 경우 문자열이 남아있음
            list.add(string);
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){ // 리스트 -> 배열
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}