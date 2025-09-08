import java.util.*;
class Solution {
    public int solution(String t, String p) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = p.length();
        int count = 0;
        for(int i = 0; i < t.length() - len + 1; i++){
            list.add(t.substring(i, i + len));
        }
        for(int i = 0; i < list.size(); i++){
            if(Long.parseLong(list.get(i)) <= Long.parseLong(p))
                count++;
        }
        return count;
            
    }
}