function solution(my_string) {
  var ans = my_string.split(' ')
  let a =[];
  let temp = [];
  for (let i =0; i<ans.length ;i++){
      if (ans[i]=='+') a.push(~~a.pop()+~~ans[++i])
      // ~~ 비트연산자 '1010'을 '0101'로 바굼, 두번하면 정수로 바뀌는 부수효과
      else if (ans[i]=='-') a.push(~~a.pop()-ans[++i])
      else a.push(ans[i]);
  }
  return a[0];
}

var solution=eval

function solution(my_string) {
  return (new Function ('return '+my_string))(); 
  // eval(my_string);
  // eval은 문자열을 평가식처럼 실행, 되도록 쓰지 말것
}

console.log(solution(
  24
))
// "11000"