const solution = (sides) => {
    sides.sort((a, b) => a - b); // 오름차순
    return sides[0] + sides[1] > sides[2] ? 1 : 2;
}