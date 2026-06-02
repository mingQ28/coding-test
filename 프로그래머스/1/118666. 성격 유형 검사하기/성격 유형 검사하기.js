function solution(survey, choices) {
    const score = {
        R: 0,
        T: 0,
        C: 0,
        F: 0,
        J: 0,
        M: 0,
        A: 0,
        N: 0
    };
    
    survey.reduce((acc, cur, idx) => {
        if(choices[idx] < 4) acc[cur.at(0)] += typeTestScore(choices[idx]);
        else if(choices[idx] > 4) acc[cur.at(1)] += typeTestScore(choices[idx]);
        return acc;
    }, score);
    
    var ans = (score['R'] >= score['T'] ? "R" : "T")
        + (score['C'] >= score['F'] ? "C" : "F")
        + (score['J'] >= score['M'] ? "J" : "M")
        + (score['A'] >= score['N'] ? "A" : "N");
    return ans;
}
var typeTestScore = (score) => {
    switch(score) {
        case 1:
            return 3;
            break;
        case 2:
            return 2;
            break;
        case 3:
            return 1;
            break;
        case 4:
            return 0;
            break;
        case 5:
            return 1;
            break;
        case 6:
            return 2;
            break;
        case 7:
            return 3;
            break;
    }
}