function solution(my_string) {
  var ans = my_string.split(' ')
  let a =[];
  let temp = [];
  for (let i =0; i<ans.length ;i++){
      if (ans[i]=='+') a.push(~~a.pop()+~~ans[++i])
      else if (ans[i]=='-') a.push(~~a.pop()-ans[++i])
      else a.push(ans[i]);
  }
  return a[0];
}

var solution=eval

function solution(my_string) {
  return (new Function ('return '+my_string))(); //eval(my_string);
}

console.log(solution(
  24
))
// "11000"