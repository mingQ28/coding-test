import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> que = new ArrayDeque<>();
        int len1 = cards1.length; // cards1의 길이
        int cnt1 = 0; // cards1 count
        int len2 = cards2.length; // cards2의 길이
        int cnt2 = 0; // cards2 count
        for(int i = 0; i < goal.length; i++){
            if(cnt1 < len1 && goal[i].equals(cards1[cnt1])){ // cards1와 goal[i]가 일치하면
                que.push(cards1[cnt1]); // que에 푸쉬
                cnt1++;
            }else if(cnt2 < len2 && goal[i].equals(cards2[cnt2])){ // cards2와 goal[i]가 일치하면
                que.push(cards2[cnt2]); // que에 푸쉬
                cnt2++;
            } else { // 무조건 카드 사용 후에 다음 카드로 넘어가기 때문에 일치하는 카드가 없는 경우 goal를 절대 만들 수 없음
                return "No";
            }
        }
        return "Yes";
    }
}