# 정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.
# 1) 2를 곱한다.
# 2) 1을 수의 가장 오른쪽에 추가한다.
# A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
import sys
a, b = map(int, sys.stdin.readline().split())

answer = 1
# 과정을 뒤집어서 생각하면, b에서 뒤의 1을 지우거나, 2를 나누면서 a를 만드는 데 필요한 수를 구해도 된다.
while True:
    if b == a:
        break
    # 계산할 수 없게 된 상황이면 -1을 치고 루프를 탈출한다.
    elif (b % 2 != 0 and b % 10 != 1) or (b < a):
        answer = -1
        break
    else:
        # 1을 뺄 수 있는 상황이면 1을 빼준다.
        if b % 10 == 1:
            b //= 10
        # 2로 나눌 수 있는 상황이면
        elif b % 2 == 0:
            b //= 2
    answer += 1
# a랑 b가 같아졌다면 답을 출력한다.
print(answer)

