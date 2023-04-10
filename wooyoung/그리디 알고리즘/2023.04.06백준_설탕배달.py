n = int(input())

count = 0

while n>=0:
    if n % 5  == 0 :
        count = count + (n//5)
        print(count)
        break
    n = n - 3
    count = count + 1
else:
    print(-1)
