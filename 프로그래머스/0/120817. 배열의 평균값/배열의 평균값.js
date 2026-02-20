const solution = numbers => {
    return numbers.reduce((acc, num) => acc += num) / numbers.length;
}