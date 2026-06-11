function solution(today, terms, privacies) {
    var todPeriod = totalPeriod(today);
    var term = [];
    terms.forEach(x => {
        var [name, period] = x.split(' ');
        term[name] = period * 28;
    })
    
    var answer = []
    privacies.forEach((priv, idx) => {
        var [date, trm] = priv.split(' ');
        var curPeriod = totalPeriod(date);
        answer = todPeriod >= curPeriod + term[trm] ? [...answer, idx + 1] : answer;
    })
    return answer;
}

var totalPeriod = date => {
    var [year, month, day] = date.split('.');
    return Number(year) * 12 * 28 + Number(month) * 28 + Number(day);
}