// node filepath 로 실행
const m="(0) 삽입  (1) 삭제  (2) 인쇄 (3) 검색  (4) 종료 ";
// 배열에 넣을 기본 자료형 (data:난수, link:뒤의 자료 인덱스)
class linkdata {
    data=0;
    link=0;
    constructor (data, idx){
        this.data = data;
        this.link = idx
    }
}
// 초기화
const dataset=[];
dataset.push(new linkdata(null, 0))
let precur = 0
let cur = 1;


function search(i){
    if (dataset[0].data ==i) return dataset[0].link;
    
    while (true) {
        let sc =dataset[0].link;
        if (dataset[sc].data ==i) return "인덱스는"+dataset[sc].link+"입니다."
        sc=dataset[sc].link;
        if (sc==0) break;
    }
    return "데이터가 없습니다."

}


console.log(m);
process.stdin.on('data', s => {
    if (s==0) {
        console.log("난수를 링크 끝에 삽입합니다.")
        dataset[cur]=new linkdata(~~(Math.random()*100), 0);
        dataset[precur++].link=cur++;
        console.log(m);
    }

    if (s==2) {
        console.log("현제 모든 simple linked list : ")
        console.log(dataset)
        console.log(m);
    }

    if (s==3) {
        console.log("검색할 data를 입력하세요(1~100사이 정수) : ")
        process.stdin.on('data', s => {
            console.log(search(s));
        })
    }



})
