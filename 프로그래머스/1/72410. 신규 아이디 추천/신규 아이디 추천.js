function solution(new_id) {
    new_id = new_id.toLowerCase() // 1
                    .replace(/[^a-z0-9\-_.]/g, '') // 2
                    .replace(/\.{2,}/g, '.') // 3
                    .replace(/^\.|\.$/g, '') // 4
                    .replace(/^$/g, 'a') // 5
                    .slice(0, 15) // 6
                    .replace(/\.$/g, ''); // 6
    if(new_id.length <= 2){
        while(new_id.length < 3){
            new_id += new_id[new_id.length - 1];
        }
    }
    return new_id;
}