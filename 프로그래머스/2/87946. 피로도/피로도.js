function solution(k, dungeons) {
    var visited = Array(dungeons.length).fill(false);
    var maxVisited = 0;
    
    var dfs = (currentK, visitedDunC) => { // 현재 피로도, 방문한 던전 수
        maxVisited = Math.max(maxVisited, visitedDunC);
        
        for(let i = 0; i < dungeons.length; i++){
            if(!visited[i] && currentK >= dungeons[i][0]){
                visited[i] = true;
                dfs(currentK - dungeons[i][1], visitedDunC + 1);
                visited[i] = false;
            }
        }
    }
    dfs(k, 0);
    return maxVisited;
}
// dfs