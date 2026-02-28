function solution(a, b) {
    var ab = String(a) + String(b) + "";
    var ba = String(b) + String(a) + "";
    return ab >= ba ? parseInt(ab) : parseInt(ba);
}