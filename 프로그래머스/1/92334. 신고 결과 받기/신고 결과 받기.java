import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> hash1 = new HashMap<>(); // 신고 유저 정보
        HashMap<String, Integer> hash2 = new HashMap<>(); // 신고 카운트
        for(int i = 0; i < id_list.length; i++){ // 초기화
            hash1.put(id_list[i], new HashSet<>());
            hash2.put(id_list[i], i);
        }
        for(int i = 0; i < report.length; i++){ // 유저 저장
            String[] str = report[i].split(" ");
            hash1.get(str[1]).add(str[0]);
        }
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){ // 각 유저별로 신고당한 횟수 확인
            HashSet<String> users = hash1.get(id_list[i]);
            if(users.size() >= k){
                for(String user : users){
                    answer[hash2.get(user)]++;
                }
            }
        }
        return answer;
        
    }
}