n = int(input())

W_Time = list(map(int , input().split()))

W_Time.sort()
##W_Time_list = sorted(W_Time)

result = 0
for i in range (1, n+1):
    result = result + sum(W_Time[0:i])

print(result)