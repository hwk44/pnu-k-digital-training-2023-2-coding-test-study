function solution(s){
  if (s[0]==')' || s.length%2!=0) return false;
  let st = [1];
  let ck = (i)=>{
      if (st.length==0) return false;
      if (i=='(') st[st.length]=1;  
      //st.push() 는 효율성 통과 못함 (배열길이++ 해서 새로 만들어 복사 하는 방식)
      //st[st.length] 는 뒤에 객체처럼 추가함, for of forEach 문 등으로 추가한 요소 순회 안됨
      if (i==')') st.pop();
  }
  [...s].forEach(i=>ck(i));
  return (st.length==1) ? true : false;
}

console.log(solution(
  "(())()"	
))
// true
