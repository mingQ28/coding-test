import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){ // commands의 크기만큼
            List<Integer> list = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){ // array 요소를 commands에 따라 자르기 위해
                list.add(array[j]); // 리스트에 추가
            }
            Collections.sort(list); // 리스트 정렬
            answer[i] = (list.get(commands[i][2] - 1)); // commands[i][2]번째 요소에 있는 값 리스트 추가
            list.clear();
        }
        return answer;
    }
}