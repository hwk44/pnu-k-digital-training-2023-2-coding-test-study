'''
시간이 적게 걸리는 순서대로 솔트 
하나씩 꺼내서 더하기
i번째 사람이 돈을 인출할 때 걸리는 시간은 p_sorted[i]
뒤에 서 있는 사람들이 모두 돈을 인출할 때까지 대기 -> * (n-i)
'''
n = int(input())
p = list(map(int, input().split()))

p_sorted = sorted(p)  # 시간이 적게 걸리는 순서대로 정렬

sum_time = 0
for i in range(n):
    sum_time += p_sorted[i] * (n-i)

print(sum_time)

