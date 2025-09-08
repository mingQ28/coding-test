class Solution {
    public int solution(int num) {
        int count = 0;
        long n = num;
        while(n != 1){
            // n * 3을 하면서 int의 범위를 넘어갈 수 있어서 long 타입지정
            n = n % 2 == 0 ? n / 2 : (n * 3) + 1;
            count++;
            if(count == 500)
                return -1;
        }
        return count;
    }
}