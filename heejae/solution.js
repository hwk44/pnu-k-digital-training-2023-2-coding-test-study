function solution(key, bd) {
  let ans = [0, 0];
  for (let a of key) {
    switch (a) {
      case 'left': if (ans[0] > -(bd[0] - 1) / 2) ans[0] -= 1;
        break;
      case 'right': if (ans[0] < (bd[0] - 1) / 2) ans[0] += 1;
        break;
      case 'up': if (ans[1] < (bd[1] - 1) / 2) ans[1] += 1;
        break;
      case 'down': if (ans[1] > -(bd[1] - 1) / 2) ans[1] -= 1;
        break;
    }
  }
  return ans;
}

console.log(solution(
  ["left", "left", "left", "left", "right", "right", "right", "right"], [5, 5]
))
// "[2, 1]