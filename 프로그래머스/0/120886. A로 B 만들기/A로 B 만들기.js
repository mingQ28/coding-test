const solution = (before, after) => {
    return [...before].reduce((acc, cur) => {
        return acc.replace(cur, "");
    }, after).length === 0 ? 1 : 0;
}