n = int(input())
p1 = list(map(int, input().split()))
p2 = sorted(p1)
sum_p = 0
p3 = []
for i in p2:
    sum_p += i
    p3.append(sum_p)
result = sum(p3)
print(result)