# 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
# 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

import sys
n, k = list(map(int, sys.stdin.readline().split()))
answer = 0
# 코인들의 리스트를 만들고 그 안에 동전들을 넣어 주었다.
coins = []
for _ in range(n):
    coins.append(int(input()))
# 큰 수부터 빼기 위해 리스트를 내림차순으로 큰 값부터 오게 정렬했다.
coins.sort(reverse=True)

for i in range(len(coins)):
    answer += k // coins[i]
    k = k % coins[i]
    if k == 0:
        break

print(answer)


