const solution = (array) => {
    return array
        .sort((a, b) => a - b)
        .at(Math.floor(array.length / 2));
}
// at : 특정 인덱스의 값을 가져오는 메소드