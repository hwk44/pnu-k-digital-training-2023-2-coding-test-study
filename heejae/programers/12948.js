function solution(arr) {
  arr.splice(arr.indexOf(Math.min(...arr)),1);
  return arr;
}

console.log(solution(
  [4,3,2,1]	
))
// [4,3,2]