function solution(n, words) {
    var per = 0, round = 0;

    for(let i = 1; i < words.length; i++) {
        var prev = words[i - 1].at(-1);
        if(words[i].at(0) !== prev 
           || words.indexOf(words[i]) < i){
            per = (i % n) + 1;
            round = Math.floor(i / n) + 1;
            break;
        }
    }

    return [per, round];
}