class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int num = n;
        while(num >= a){
            int val = (num / a) * b;
            System.out.println(val);
            sum += val;
            num = val + (num % a);
        }
        return sum;
    }
}