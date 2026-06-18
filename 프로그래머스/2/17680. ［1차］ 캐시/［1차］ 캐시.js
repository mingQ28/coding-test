function solution(cacheSize, cities) {
    var cache = [];
    var cnt = 0;
    
    if(cacheSize === 0) return cities.length * 5;
    
    cities.forEach(city => {
        city = city.toLowerCase();
        if(cache.includes(city)){ // 캐시 히트
            var idx = cache.indexOf(city); // 먼저 해당 도시의 인덱스 찾기
            cache.splice(idx, 1); // 기존 배열에서 도시 삭제 후
            cache.push(city); // 마지막에 다시 도시 추가
            cnt += 1;
        }else{ // 캐시 미스
                if(cache.length === cacheSize){ // 캐시가 꽉 차 있을 경우
                    cache.shift(); // 가장 오래된 캐시 삭제
                }
            cache.push(city);
            cnt += 5;
        }
    })
    return cnt;
}