# s의 최솟값 구하기, A Lnum, b Snum 
# pop
# 정렬x

n = int(input())
a_lst = list(map(int, input().split()))
b_lst = list(map(int, input().split()))

s=0
for i in range(n):
    s += min(a_lst)*max(b_lst)
    a_lst.pop(a_lst.index(min(a_lst)))
    b_lst.pop(b_lst.index(max(b_lst)))


print(s)



