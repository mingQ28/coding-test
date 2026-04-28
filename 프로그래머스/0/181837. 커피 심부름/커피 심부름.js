function solution(order) {
    return order.reduce((acc, cur) => {
        cur.includes("cafelatte") ? acc += 5000 : acc;
        cur.includes("americano") || cur.includes("anything") ? acc += 4500 : acc;
        return acc;
    }, 0);
}