N,K = map(int, input().split())
coins = []
for i in range(N):
    coins.append(int(input()))
coins.sort(reverse=True)

result = 0
for i in coins:
    result = result + (K // i)
    K = K % i
print(result)