# 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
# S = A[0] × B[0] + ... + A[N-1] × B[N-1]
# S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
# S의 최솟값을 출력하는 프로그램을 작성하시오.

import sys
n = int(input())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))

result = 0
# a의 가장 작은 수와 b의 가장 큰 수부터 각각 곱해나가도록 하면 가장 작은 값을 도출할 수 있다.
sa = sorted(a)
sb = sorted(b, reverse=True)

for i in range(n):
    result += sa[i] * sb[i]

print(result)