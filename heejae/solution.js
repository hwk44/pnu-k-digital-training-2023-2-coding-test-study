function solution(dots) {
  let ans = (dots.map(a => (dots[0][0] - a[0]) ** 2 + (dots[0][1] - a[1]) ** 2));
  ans.sort((a, b) => b - a)
  return Math.sqrt(ans[1] * ans[2])
}

console.log(solution(
  [[-1, -1], [1, 1], [1, -1], [-1, 1]]
))
// 4