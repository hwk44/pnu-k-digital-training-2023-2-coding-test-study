# 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
# 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

import sys

n = int(input())

member = []
for i in range(n):
    a, b = map(str, sys.stdin.readline().split())
    member.append([int(a), b])
# 회원들을 나이순으로 정렬
member.sort(key=lambda x: x[0])
# 루프를 돌며 정렬한 내용 출력
for i in range(len(member)):
    print(member[i][0], member[i][1])