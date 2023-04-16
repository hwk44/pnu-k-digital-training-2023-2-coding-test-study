function solution(n, words) {
  var answer = words[0];
  let num = [0, 0]

  for (let i = 1; i < words.length; i++) {
    if (answer.includes(words[i])) {
      num = [i % n + 1, Math.ceil((i+1)/n)];
      break
    };
    if (words[i - 1][words[i - 1].length - 1] !== words[i][0]) {
      num = [i % n + 1, Math.ceil((i+1)/n)];
      break;
    }
    answer = answer + " " + words[i];
  }
  return num;
}

console.log(solution(
  2, ['ac','ca','ac','aa',"ac"]

))
    // [2,2]
