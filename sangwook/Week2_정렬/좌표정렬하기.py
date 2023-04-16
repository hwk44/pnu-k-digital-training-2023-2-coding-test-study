# 2차원 평면 위의 점 N개가 주어진다.
# 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
# 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
# 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000)
# 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
# 조건이 2개 이상일 때는 키값을 튜플 형태로, 먼저 적용할 조건부터 적어 준다.

import sys

n = int(input())

coordinate = []
for _ in range(n):
    dots = list(map(int, sys.stdin.readline().split()))
    coordinate.append(dots)

lst = sorted(coordinate, key=lambda x: (x[0], x[1]))

for i in range(len(lst)):
    print(lst[i][0], lst[i][1])