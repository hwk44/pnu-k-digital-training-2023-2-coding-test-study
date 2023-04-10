# N, M을 공백 기준으로
n, m = map(int, input().split())

result = 0
# 한 줄씩 입력
for i in range(n):
    data = list(map(int, input().split()))
    # 현재 가장 작은 수
    min_value = 10001
    for a in data:
        min_value = min(min_value, a)
    # 가장 작은 수 중에서 가장 큰 수
    result = max(result, min_value)

print(result)