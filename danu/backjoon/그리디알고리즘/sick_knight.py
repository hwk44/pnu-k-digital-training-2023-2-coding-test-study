'''
체스판 위?
방문했던 칸?
이동 방식을 모두 사용?

이동 횟수가 4번 미만-> 다 상관없음
이동 횟수가 4번 이상-> 이동 방식을 모두 사용
--> 첫 번째 이동 2칸 위로, 1칸 오른쪽 fix

이동 방식을 모두 사용/ 상관X
모든 이동 방식을 한 번씩 사용 && 체스판 위 확인 -> 1 증가
첫 이동 제외 3가지 중 가장 많은 칸을 방문할 수 있는 방식을 선택 && 체스판 위 확인 -> 1 증가 
'''

'''
n, k = map(int, input().split())

if k == 1 or k >= n:
    print(n-1)
else:
    cnt = 0
    while n > 1:
        if n % k == 0:
            n //= k
            cnt += 1
        else:
            cnt += n - n // k * k
            n = n // k * k
    print(cnt + n - 1)
'''

n, k = map(int, input().split())

if k == 1 or k >= n:
    print(n-1)
else:
    cnt = 0
    while n > 1:
        if n % k == 0:
            n //= k
            cnt += 1
        else:
            cnt += n - (n // k) * k
            n = (n // k) * k
    cnt += n-1
    print(cnt)
# k가 1일 때와 k가 n보다 클 때를 처리하도록 수정
# FIXME
