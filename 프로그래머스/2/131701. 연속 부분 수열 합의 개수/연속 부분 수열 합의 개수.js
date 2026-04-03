function solution(elements) {
    var set = new Set();
    
    for(let i = 0; i < elements.length; i++){
        let sum = 0;
        for(let j = 0; j < elements.length; j++){
            // 원형 수열 처리:
            // (i + j) % elements.length 를 사용하면 인덱스가 배열 길이를 넘어가도
            // 다시 0부터 순환하면서 값을 가져올 수 있음
            
            // i를 시작점으로 잡고, 길이를 1부터 n까지 늘려가며
            // 연속 부분 수열의 합을 누적해서 구하는 방식
            sum += elements[(i + j) % elements.length]; 
            set.add(sum);
        }
    }
    
    return set.size;
}
// {} 는 Map이 아니라 일반 객체(Object)
// Map을 사용하려면 new Map()으로 생성해야 함