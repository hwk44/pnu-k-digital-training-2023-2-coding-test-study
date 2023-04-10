n, k = map(int(input).split())
a =list(map(int(input).split()))
b =list(map(int(input).split()))

a_sort = sorted(a) # 오름차순
b_sort = sorted(b,reverse=True) # 내림차순

# 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
for i in range(k):
    # a의 원소가 b의 원소보다 작은 경우
    if a_sort[i] < b_sort[i]:
        # 두 원소 교체
        a_sort[i], b_sort[1] = b_sort[i], a_sort[i]
    else: # a의 원소가 b의 원소보다 크거나 같을 때, 반복문 탈출
        break
print(sum(a_sort))