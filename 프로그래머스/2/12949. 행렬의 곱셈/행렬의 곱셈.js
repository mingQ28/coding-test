function solution(arr1, arr2) {
    return arr1.map((x, idx1) => 
        arr2[0].map((y, idx2) => 
            x.reduce((acc, cur, k) => acc + cur * arr2[k][idx2], 0)
        )
    )
}