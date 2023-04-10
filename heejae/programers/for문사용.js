function gcdlcm(a, b) {  
  var r;
  for (var ab = a * b; r = a % b; a = b, b = r) { }
  return [b, ab / b];
}
//호재법 보단 for문 사용 학습
// 포문 조건식에 선언한 변수는 상위스코프에서 사용 가능
// 조건식 세번째 증감식 , 로 두개 삽입 가능
// 조건식 두번째 비교식 0으로 false 

function solution(n, m) {
  var answer = [];
  if (n > m) {
    m = m + n;
    n = m - n;
    m = m - n
  }
  temp = [];
  for (let i = 1; i <= m; i++) {
    if (n % i == 0 && m % i == 0) temp.push(i)
  }
  answer.push(Math.max(...temp))
  answer.push(n * m / answer[0])
  return answer;
}

console.log(gcdlcm(
  3,	12	
))
// [3, 12]