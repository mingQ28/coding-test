function solution(n,a,b)
{
    var cnt = 0;
    while(a != b){
        a = Math.ceil(a / 2);
        b = Math.ceil(b / 2);
        
        cnt++;
    }
    return cnt;
}
// 1 → 1, 2 → 1, 3 → 2, 4 → 2, ... : 현재 번호를 2로 나눈값의 올림값으로 계산
// 두 번호가 같아질때 두 참가자가 붙는다.