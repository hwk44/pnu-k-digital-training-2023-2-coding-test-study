# 내 코드
n = int(input())
ln = list(map(int, input().split()))
s = list(map(int, input().split()))
ln_c = 0
result = 0
for i in ln:
    ln_c += i
if min(s) == s[0]:
    result = s[0] * ln_c
else:
    for i in s:
        if i < min(s):
            result = s[i] * ln[i]
print(result)

# 정답 version
n = int(input())
ln = list(map(int, input().split()))
s = list(map(int, input().split()))
result = 0
min_price = s[0]
for i in range(n-1):
    if s[i] < min_price:
        min_price = s[i]
    result += min_price * ln[i]
print(result)