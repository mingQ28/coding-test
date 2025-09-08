import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
    
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + "" + strings[i]);
        }
        String[] string =  list.toArray(new String[list.size()]);
        Arrays.sort(string);
        for(int i = 0; i < strings.length; i++){
            string[i] = string[i].substring(1);
        }
        return string;
    }
}