function solution(n, arr1, arr2) {
    var answer = Array.from({ length: n }, () => Array(n).fill(' ')) // n * n 크기의 공백으로 채운 2차원 배열 생성
    arr1.forEach((x, idx1) => {
        var bi = x.toString(2).padStart(n, '0');
    
        [...bi].forEach((y, idx2) => {
            if (y === "1") answer[idx1][idx2] = "#";
        });
    });
    
    arr2.forEach((x, idx1) => {
        var bi = x.toString(2).padStart(n, '0');
    
        [...bi].forEach((y, idx2) => {
            if (y === "1") answer[idx1][idx2] = "#";
        });
    });
  
    return answer.map(x => x.join(''));
}