const solution = (num, k) => {
    var str = String(num).split('');
    return str.includes(String(k)) ? str.indexOf(String(k)) + 1 : -1;
}