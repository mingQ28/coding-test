function solution(cards1, cards2, goal) {
    var a = 0, b = 0;
    var res = "Yes";
    goal.map(x => cards1[a] === x ? 
             a++ : cards2[b] === x ? b++ : res = "No"
    )
    
    return res;
}