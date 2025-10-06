import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap<>();
        for(String com : completion){ // 완주자를 일단 해시에 저장
            // getOrDefault : 기본값 0으로 해시에 이미 존재하는 값일 경우 1씩 증가
            hash.put(com, hash.getOrDefault(com, 0) + 1);
        }
        for(String part : participant){
            // getOrDefault : 기본값 0으로 해시에 이미 존재하는 값일 경우 1씩 감소
            hash.put(part, hash.getOrDefault(part, 0) - 1);
        }
        for(String key : hash.keySet()){
            if(hash.get(key) != 0)
                return key;
        }
        return "";
    }
}