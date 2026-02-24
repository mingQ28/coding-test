function solution(box, n) {
    return (Math.trunc(box[0] / n) * Math.trunc(box[1] / n)) * Math.trunc(box[2] / n);
}