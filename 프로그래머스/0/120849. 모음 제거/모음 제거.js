function solution(my_string) {
    var vo = ['a', 'e', 'i', 'o', 'u'];
    for(let i = 0; i < 5; i++){
        my_string = my_string.replaceAll(vo[i], ""); 
    }
    return my_string;
}
// replaceAll : 원본을 교체하지 않음