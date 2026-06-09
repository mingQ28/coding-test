function solution(players, callings) {
    const playerRank = {};
    const rankPlayer = {};

    players.forEach((player, idx) => {
        playerRank[player] = idx;
        rankPlayer[idx] = player;
    });
    
    callings.forEach(name => {
        const curRank = playerRank[name]; // 불린 선수의 등수
        const frontPlayer = rankPlayer[curRank - 1]; // 불린 선수 앞에 있는 등수의 선수
        // rankPlayer 갱신
        rankPlayer[curRank - 1] = name;
        rankPlayer[curRank] = frontPlayer;

        // playerRank 갱신
        playerRank[name]--;
        playerRank[frontPlayer]++;
    })
    
    return Object.values(rankPlayer);
}