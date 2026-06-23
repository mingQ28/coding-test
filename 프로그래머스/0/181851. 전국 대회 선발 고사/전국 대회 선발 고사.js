function solution(rank, attendance) {
    var map = rank.filter((cur, idx) => attendance[idx]).sort((a, b) => a - b);
    return 10000 * rank.indexOf(map[0]) + 100 * rank.indexOf(map[1]) + rank.indexOf(map[2]);
}