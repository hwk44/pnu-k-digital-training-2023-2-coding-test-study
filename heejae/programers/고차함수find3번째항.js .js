var solution=(_,$)=>_.find(_=>!$[_]--,$.map(_=>$[_]=($[_]|0)+1))

// 자바스크립트의 es5이후 고차함수는 대부분 다음 형식을 가짐
// map,reduce등 Array.prototype.고차함수.( (콜백안 매개변수1, 매개변수2, 매개변수3, 콜백안 매개변수4)=>
//                                    (콜백결과 리턴) ,구차함수 인수2 ,고차함수 인수3)
// 보통 콜백안 매개변수는 1번 순회하는 배열항, 2번 인덱스, 3번 this(호출한 배열)
// reduce는 제일 앞에 그전까지 총합이 오면서 3개가 뒤로 밀려 콜백이 4개의 매개변수 받음
// 순서가 없는 set의 고차함수도 비슷한 구조를 위해 두번째 매개변수는 첫번째외 같은 요소 하나가 옴

// 콜백 밖 고차함수의 두번째 인수로 find는 전처리가옴. 이는 콜백보다 먼저 평가 됨
var solution = (participant, completion) => participant.find(
    // parti 와 complet을 받아 pati에 관해 find 돌림
    
    name => !completion[name]--,
    // 콜백은 cmomplet의 파라메터로 parti의 요소항의 평가값이 false 인것을 찾음
    
    completion.map(
    name => completion[name] = (completion[name] | 0) + 1));
    // 먼저 평가되는 두번째 전처리는 comp로 map을 돌리는데 반환되는 배열은 버리고 map이 돌면서 변형하는 completi를 이용
    // map으로 순회하면서 completi[요소]이 존재하지 않으면 새로 만들고(첫요소), 이미존제하면 카운트 올림(중복요소)
    // 파인드로 찾으면서 후평가로 카운트 1씩 내리다가 0이되면 리턴
    
  


  console.log(solution(
  
      ["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]
  ))
  //문제: a(출전자 명단), b(완주자 명단) 이 있을떄 완주하지 못한 사람을 찾기 (같은 이름이 있고, 완주하지 못한 선수는 한명)
  
  