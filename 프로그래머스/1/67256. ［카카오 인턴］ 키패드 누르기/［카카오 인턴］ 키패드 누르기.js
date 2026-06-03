function solution(numbers, hand) {
    const pos = { // 2차원 배열로 위치 설정
        1:[0,0], 2:[0,1], 3:[0,2],
        4:[1,0], 5:[1,1], 6:[1,2],
        7:[2,0], 8:[2,1], 9:[2,2],
        '*':[3,0], 0:[3,1], '#':[3,2]
    };
    
    var getDistance = (from, to) => { // 거리 계산 함수
        const [a1, b1] = pos[from];
        const [a2, b2] = pos[to];

        return Math.abs(a2 - a1) + Math.abs(b2 - b1);
    }
    
    var left = '*';
    var right = '#';
    
    return numbers.map(x => {
        console.log("x : " + x + " left : " + left + " right : " + right);
        if(x === 1 || x === 4 || x === 7) {
            left = x; 
            return 'L';
        }
        else if(x === 3 || x === 6 || x === 9) {
            right = x;
            return 'R';
        }
        else{
            var leftD = getDistance(x, left);
            var rightD = getDistance(x, right);
            if(leftD > rightD){
                right = x;
                return 'R';
            }else if(leftD < rightD){
                left = x;
                return 'L';
            }else{
                console.log("same x = " + x + " left : " + left + "right : " + right)
                if(hand === "left"){
                    left = x;
                    return 'L';
                }else{
                    right = x;
                    return 'R';
                }
            }
        }  
    }).join('');
}