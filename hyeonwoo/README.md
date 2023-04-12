##  매주 과제
> 백준  단계별로 풀어보기 

## 그리디 강의
- 강의 - 거스름돈, 1될때까지, 곱하기 or 더하기, 큰 수의 법칙, 모험가길드
- 
## DFS / BFS
> 재귀함수로 DFS를 구현하면 컴퓨터 시스템 동작 특성상 수행시간이 느려질 수 있음 <br/>
> 많은 연산을 필요로 할 때 DFS(Stack) 보다는 BFS(Queue) 구현이 조금 더 빠르다.
- 강의 - 그래프 방문 처리
<br />
## 정렬
> 선택 정렬, 삽입 정렬의 경우 시간 복잡도가 O(N**2)
<hr/>

## 백준 못푼 문제 / 에러 처리

### _1339_단어수학 - 미결
    - 예제입력은 다 통과
    - 예외 케이스를 모르겠음

### _1181_단어정렬 (정렬) - 중복 제거 / 정렬
    -  Set으로 중복 제거 후 sort
```java
    Set<String> set = new HashSet<>();
    set.add(data);
    List<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>(){
            // Comparator 구현
        }
```
### _10610_30 런타임 에러 NumberFormatException - 해결
    - String 으로 출력해야 함 
    - 10의 배수가 아닐때에도 -1 을 출력하게 해야 함
### _1541_잃어버린괄호 index 에러
    - test case 마다 배열 크기가 다르므로 예외처리 line 30
### _11047_동전0
    - 동전하나로 딱 나누어 떨어질때 예외 처리 line 24
### _1931_회의실 배정
    - Comparator
