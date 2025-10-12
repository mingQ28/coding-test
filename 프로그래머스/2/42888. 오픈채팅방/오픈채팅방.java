import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> hash = new HashMap<>(); // 유저아이디과 닉네임 저장
        List<String> list = new ArrayList<>(); // 출력문을 저장할 리스트
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){ // 엔터일 경우, 해시에 저장
                hash.put(str[1], str[2]);
            }else if(str[0].equals("Change")){ // 체인지일 경우, 닉네임 변경
                hash.replace(str[1], str[2]);
            }
            // 리브일 경우 해시에는 별도의 수행 없음
        }
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                list.add(hash.get(str[1]) + "님이 들어왔습니다.");
            }else if(str[0].equals("Leave")){
                list.add(hash.get(str[1]) + "님이 나갔습니다.");
            }
            // 체인지일 경우 별도의 출력문 없음
        }
        String[] arr = list.toArray(new String[list.size()]);
        return arr;
    }
}