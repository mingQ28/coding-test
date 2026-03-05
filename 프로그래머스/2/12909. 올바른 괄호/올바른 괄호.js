const solution = (s) => {
    var stack = [];
    for(const c of s){
        if(stack.length !== 0 && c === ')') 
            stack.pop();
        else stack.push(c); 
    }
    return stack.length === 0 ? true : false;
}