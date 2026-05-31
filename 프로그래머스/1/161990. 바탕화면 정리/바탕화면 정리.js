function solution(wallpaper) {
    var minCol = Infinity;
    var minRow = Infinity;
    var maxCol = -Infinity;
    var maxRow = -Infinity;
    for(let i = 0; i < wallpaper.length; i++){
        for(let j = 0; j < wallpaper[0].length; j++){
            if(wallpaper[i][j] === '#'){
                minRow = Math.min(minRow, i);
                maxRow = Math.max(maxRow, i);
                minCol = Math.min(minCol, j);
                maxCol = Math.max(maxCol, j);
            }
        }
    }
    return [minRow, minCol, maxRow + 1, maxCol + 1];
}