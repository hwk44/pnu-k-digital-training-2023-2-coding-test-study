function solution(k) {
  class Sol {
    ans = 0;
    sol = (n) => {
      if (n > 10) {
        this.ans += n % 10;
        this.sol(~~(n / 10));
      }
      else this.ans += n;
    }
  }
  let solve = new Sol();
  solve.sol(k)
  return solve.ans;
}
console.log(solution(
  930211
))
// 16

// function solution(n) {
//   return n
//     .toString()
//     .split("")
//     .reduce((acc, cur) => acc + Number(cur), 0);
// }

// function solution(n) {
//     let result = 0;

//     while (n > 0) {
//         result += n % 10;

//         n = Math.floor(n/10);
//     }

//     return result;
// }

// function solution(n) {
//     return (n+'').split('').map(v=>+v).reduce((a,v)=>a+v,0);
// }