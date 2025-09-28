// 교재 참고
// 첫 번째 작업부터 시작하여, 현재 작업이 이전 작업보다 빨리 끝나면 함께 배포 가능  
// 현재 작업이 이전 작업보다 늦게 끝나면 이전까지의 배포 개수를 큐에 추가하고 카운트 초기화  
// 모든 작업을 순회한 후 마지막 카운트를 큐에 추가
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> que = new ArrayDeque<>();
        int[] array = new int [progresses.length];
        for(int i = 0; i < progresses.length; i++){
            array[i] = (100 - progresses[i]) / speeds[i]; 
            if((100 - progresses[i]) % speeds[i] != 0)
                array[i]++;
        }
        int count = 0;
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] <= max){
                count++;
            }else {
                que.add(count);
                count = 1;
                max = array[i];
            }
        }
        que.add(count);
        return que.stream().mapToInt(Integer::intValue).toArray();
    }
}