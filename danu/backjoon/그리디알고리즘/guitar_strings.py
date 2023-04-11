n, k = map(int, input().split())
packages = []
singles = []
for i in range(k):
    package, single = map(int, input().split())
    packages.append(package)
    singles.append(single)

min_package = min(packages)
min_single = min(singles)

if min_single * 6 < min_package:
    # 낱개 < 패키지 -> 낱개
    total_cost = min_single * (n // 6)
    if n % 6 != 0:
        # 남은 줄 o
        total_cost += min_single
else:
    # 낱개 < 패키지 -> 패키지
    total_cost = min_package * (n // 6)
    # 패키지로 다 사고 남은 줄 -> 낱개
    if min_package < min_single * (n % 6):
        total_cost += min_package
    else:
        total_cost += min_single * (n % 6)

print(total_cost)
