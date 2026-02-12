import java.io.*;
import java.util.*;

/**
 * 실버 5
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> que = new ArrayDeque<>();

        String document = br.readLine(); // 문서 이름
        String search = br.readLine(); // 검색 단어

        int cnt = 0; // 검색 단어와 일치하는지 카운트
        for (int i = 0; i <= document.length() - search.length(); ) {

            if (document.substring(i, i + search.length()).equals(search)) {
                cnt++;
                i += search.length();  // 겹치지 않게 이동
            } else {
                i++;
            }
        }
        System.out.println(cnt);

    }
}