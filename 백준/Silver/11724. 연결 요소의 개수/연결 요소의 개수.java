import java.util.*;
import java.io.*;

/**
 * [문제 요약]
 * 주어진 그래프에서 "연결 요소의 개수"를 구하는 문제.
 * 예: 1-2-4, 3-5 이면 연결 요소는 2개.
 * 방향이 주어지지 않았으므로, 무방향 그래프로 간주.
 */

public class Main {
    static boolean visited[];              // 각 노드 방문 여부를 저장
    static ArrayList<Integer>[] array;     // 인접 리스트 (그래프 저장 구조)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 정점(n)과 간선(m) 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        // 방문 배열 및 인접 리스트 초기화
        visited = new boolean[n + 1];
        array = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = new ArrayList<>();
        }

        // 간선 정보 입력 (양방향 저장)
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            array[start].add(end);
            array[end].add(start);
        }

        // DFS로 연결 요소 탐색
        int count = 0; // 연결 요소 개수
        for (int i = 1; i <= n; i++) { // 정점 번호는 1부터 시작
            if (!visited[i]) { // 방문하지 않은 노드 발견 시
                DFS(i);         // DFS로 해당 노드와 연결된 모든 노드 탐색
                count++;        // 하나의 연결 요소 탐색 완료
            }
        }

        System.out.println(count); // 총 연결 요소 개수 출력
    }

    /**
     * DFS 탐색 함수
     * 현재 노드를 방문 처리하고,
     * 연결된 모든 인접 노드 중 방문하지 않은 노드를 재귀적으로 방문한다.
     */
    private static void DFS(int v) {
        visited[v] = true; // 현재 노드 방문 처리

        for (int next : array[v]) { // 인접 노드 순회
            if (!visited[next]) {   // 아직 방문하지 않은 노드라면
                DFS(next);          // DFS 재귀 호출
            }
        }
    }
}
