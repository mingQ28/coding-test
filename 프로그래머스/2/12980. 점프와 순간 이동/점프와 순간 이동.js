function solution(n)
{
    var curP = n;
    var cnt = 0;
    while(curP > 0){
        if(curP % 2 === 0) curP /= 2;
        else {
            curP--;
            cnt++;
        }
    }
    return cnt;
}