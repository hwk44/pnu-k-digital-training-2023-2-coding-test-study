'''
1. 모든 주유소의 리터당 가격은 1원이다.	
2. 2 ≤ N ≤ 1,000, 제일 왼쪽 도시부터 제일 오른쪽 도시까지의 거리는 최대 10,000, 
   리터 당 가격은 최대 10,000이다.
3. 원래의 제약조건 이외에 아무 제약조건이 없다.
'''


n = int(input())
road = list(map(int, input().split()))
price = list(map(int, input().split()))

result=price[0]*road[0] #첫번째 도시에서 두번째 도시로 가는 비용 초기값으로
min_price=price[0] #첫번째 도시에서 두번째 도시로 가는 비용을 초기 최소비용으로
distance=0 #첫번째 도시에서 두번째 도시로 가는 거리 초기값
for i in range(1,n-1): #첫번째 부터 n-2번째 도시까지 반복
   if price[i] < min_price : #현재 도시에서 다음 도시까지 가는 비용이 최소 비용보다 작은 경우
      result += min_price*distance # 최소 비용과 이전 도시와의 거리를 곱한 값을 결과값에 더하기
      distance = road[i]  # 현재 도시에서 다음 도시까지의 거리를 distance에 저장
      min_price = price[i] # 현재 도시에서 다음 도시까지의 비용을 min_price에 저장
   else : # 현재 도시에서 다음 도시까지 가는 비용이 최소 비용보다 큰 경우
      distance += road[i] # 현재 도시에서 다음 도시까지의 거리를 더하기
   if i == n-2 :  # 마지막 도시까지 계산한 경우
      result += distance*min_price  # 최소 비용과 이전 도시와의 거리를 곱한 값을 결과값에 더하기


print(result)

'''
n = int(input())
road = list(map(int, input().split()))
price = list(map(int, input().split()))

result=road[0]*price[0]
min_price=price[0] 
distance=0
for i in range(1,n-1): 
   if price[i] < min_price: 
      result += min_price*distance 
      distance = road[i] 
      min_price = price[i]
   else: 
      distance += road[i] 
   if i == n-2: 
      result += distance*min_price  
print(result)

'''