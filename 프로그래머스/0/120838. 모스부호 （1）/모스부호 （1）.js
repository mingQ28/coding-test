function solution(letter) {
    morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    
    return letter
        .split(' ')
        .map( x => String.fromCharCode(morse.indexOf(x) + 97))
        .join('');
    
}