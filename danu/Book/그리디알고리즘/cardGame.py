# N, M을 공백을 기준으로 구분하여 입력 받기
n, m = map(int, input().split())

result = 0
# 한 줄씩 입력
for i in range(n):
    data = list(map(int, input().split()))
    # 현재 줄에서 가장 작은 수
    min_value = min(data)
    # 가장 작은 수 중에서 가장 큰 수
    result = max(result, min_value)

print(result)