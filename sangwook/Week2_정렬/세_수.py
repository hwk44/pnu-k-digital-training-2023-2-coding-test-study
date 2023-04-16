# 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

import sys

a, b, c = map(int, sys.stdin.readline().split())
num = []
# 여러 요소를 한번에 추가
num.extend([a, b, c])

lst = sorted(num)
print(lst[1])