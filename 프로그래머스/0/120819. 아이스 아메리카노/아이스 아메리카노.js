const solution = (money) => {
    let arr = [Math.floor(money / 5500), money % 5500];
    return arr;
}