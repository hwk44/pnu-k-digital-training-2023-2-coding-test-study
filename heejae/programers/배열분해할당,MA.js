function solution(id, db) {
  for (let i of db){
      if (i[0]==id[0]){
          if (i[1]==id[1]) return "login"
          else return "wrong pw"
      }
  }
  return "fail"
}

function solution(id_pw, db) {
  const [id, pw] = id_pw;
  const map = new Map(db);
  return map.has(id) ? (map.get(id) === pw ? 'login' : 'wrong pw') : 'fail';
}

console.log(solution(
  ["programmer01", "15789"] ,	[["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]	
))
  // "wrong pw"