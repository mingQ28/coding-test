class Solution {
    public int solution(String my_string) {
        String[] string = my_string.split(" ");
        int a = 0;
        a = Integer.parseInt(string[0]);
        
        for(int i = 0; i < string.length - 1; i++){
            if(string[i].equals("+")){
                a += Integer.parseInt(string[i + 1]);
            }else if(string[i].equals("-")){
                a -= Integer.parseInt(string[i + 1]);
            }
        }
        return a;
    }
}