function solution(new_id) {
    new_id = [...new_id].map((x, idx) => 
                                 x.toLowerCase() // 1
                                 .replace(/[^a-z0-9\-_.]/g, '') // 2
                            ).join('');
    new_id = new_id.replace(/\.{2,}/g, '.'); // 3
    new_id = new_id = new_id.replace(/^\.|\.$/g, ''); // 4
    new_id = new_id === '' ? 'a' : new_id; // 5
    new_id = new_id.slice(0, 15); // 6
    new_id = new_id.replace(/\.$/g, ''); // 6
    if(new_id.length <= 2){
        while(new_id.length < 3){
            new_id += new_id[new_id.length - 1];
        }
    }
    return new_id;
}