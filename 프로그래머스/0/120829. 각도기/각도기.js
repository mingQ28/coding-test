const solution = angle => {
    return [0, 90, 91, 180].filter(x => angle >= x).length;
}

// 배열을 순서대로 확인하면서 조건을 만족하는 값만 걸러내고, 그 개수를 셈.