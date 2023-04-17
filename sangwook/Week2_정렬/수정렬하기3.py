# N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
# 시간제한을 해결하기 위한 빠른 입력 코드.
import sys

n = int(input())
arr = [0] * 10000
# 메모리제한을 해결하기 위한 계수정렬 코드.
for _ in range(n):
    a = int(sys.stdin.readline())
    # a의 입력값을 a의 인덱스에 저장한다.
    arr[a - 1] += 1

for i in range(10000):
    # 인덱스가 0이 아니라는 것은, 그 수가 최소한 1번은 나왔다는 것이다.
    if arr[i] != 0:
        # 나온 수만큼 값을 찍어준다.
        for j in range(arr[i]):
            print(i+1)