const solution = (num, k) => {
    return ("+" + num).indexOf(k);
}
// +를 추가한 건 num 요소를 돌 때 1부터 시자하기 위함
// includes, indexof는 배열뿐 아니라 문자열 형태에서도 지원 가능