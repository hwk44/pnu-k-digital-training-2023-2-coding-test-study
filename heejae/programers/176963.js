function solution(name, yearning, photo) {
  photo.forEach(i=>i.filter(a => name.includes(a)))
  return photo.map(i => i.reduce((a, b) => a + Number(yearning[name.indexOf(b)]||0), 0));
}


function solution(name, yearning, photo) {
    return photo.map((v)=> v.reduce((a, c)=> a += yearning[name.indexOf(c)] ?? 0, 0))
}

console.log(solution(
  ["may", "kein", "kain", "radi"], [5, 10, 1, 3],
  [["may", "kein", "kain", "radi"], ["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
))
// [19, 15, 6]

