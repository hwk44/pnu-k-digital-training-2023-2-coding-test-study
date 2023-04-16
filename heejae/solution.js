function solution(n) {
    function fib(k){
        if (k <= 2) return 1;
        return fib(k-2) + fib(k-1);
    }
    return fib(n)%1234567;
  }
  
  function solution(n) {
    now=0;
    preb= 1;
    prebb= 0;
    for (let i =2 ; i<=n; i++){
      now = (preb+ prebb)%1234567
      prebb = preb;
      preb = now;
    }
    return now
  }
  [0,1,1,2,3,5,8,13]
  
  console.log(solution(
    5
  ))
    // 5
  