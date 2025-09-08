#include <stdio.h>
#include <math.h>

int main() {
    int x1, y1, x2, y2, r1, r2, n, result;
    double dis, sub;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
        dis = sqrt(pow(x2 - x1, 2) + pow(y2 -y1, 2));
        sub = r1 > r2 ? r1 - r2 : r2 - r1;
        if(dis == 0 && r1 == r2)
            result = -1;
        else if(dis < r1 + r2 && sub < dis)
            result = 2;
        else if(dis == r1 + r2 || dis == sub)
            result = 1;
        else 
            result = 0;
        printf("%d\n", result);
    }
    
    
    return 0;
}