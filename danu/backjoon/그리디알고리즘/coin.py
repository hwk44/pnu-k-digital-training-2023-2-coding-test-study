n, k = map(int, input().split()) 
coins = sorted([int(input()) for _ in range(n)])

count = 0  # 동전의 개수
for i in range(n-1, -1, -1):  # 동전 리스트를 뒤에서부터 탐색
    if k == 0:  # 필요한 금액을 만들면 반복문 종료
        break
    if coins[i] > k:  # 동전의 금액이 필요한 금액보다 크면 다음 동전으로
        continue
    count += k // coins[i]  # 현재 동전으로 만들 수 있는 최대한의 개수
    k %= coins[i]  # 남은 금액을 계산 -> 다음 동전으로

print(count)

