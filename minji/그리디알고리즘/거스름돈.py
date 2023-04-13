n = int(input())
n1 = 1000 - n
k = [500, 100, 50, 10, 5, 1]
result = 0
for i in k:
    result += n1//i
    n1 %= i
print(result)