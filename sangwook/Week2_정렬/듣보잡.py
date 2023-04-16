# 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때,
# 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
# 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다.
# 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
# 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
# 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
# 듣보잡의 수와 그 명단을 사전순으로 출력한다.

import sys
n, m = map(int, sys.stdin.readline().split())
# 중복 방지를 위한 set 선언
set1 = set()
set2 = set()
# 듣도 못한 사람의 명단
for _ in range(n):
    name = str(sys.stdin.readline().strip())
    set1.add(name)
# 보도 못한 사람의 명단
for _ in range(m):
    name = str(sys.stdin.readline().strip())
    set2.add(name)
# 정답을 담을 리스트 생성
answer = []
# 긴 배열을 짧은 배열과 비교한다.
if n >= m:
    for i in set1:
        if i in set2:
            answer.append(i)
else:
    for i in set2:
        if i in set1:
            answer.append(i)
# 사전순 출력을 위한 정답 리스트 정렬
answer.sort()
# 출력
print(len(answer))
for i in answer:
    print(i)