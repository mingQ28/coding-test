const solution = (array, height) => {
    var arr = [...array, height];
    arr.sort((a, b) => a - b); // 오름차순 정렬
    return arr.filter(x => x > height).length;
}