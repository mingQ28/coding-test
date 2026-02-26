const solution = (order) => {
    var result = String(order).replace(/[369]/g, "a");
    
    return [...result].reduce((acc, cur) => {
        return cur === "a" ? acc += 1 : acc }, 0);
}