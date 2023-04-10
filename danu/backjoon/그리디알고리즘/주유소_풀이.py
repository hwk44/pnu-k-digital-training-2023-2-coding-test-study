n = int(input())

road = list(map(int, input().split()))
price = list(map(int, input().split()))

minPrice=price[0]
result = 0
for i in range(len(road)) :
      minPrice = min(minPrice,price[i])
      result += minPrice * road[i]

print(result)