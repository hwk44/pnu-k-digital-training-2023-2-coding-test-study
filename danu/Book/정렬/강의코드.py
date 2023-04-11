# 선택정렬
arr=[7,5,9,0,3,1,6,2,4,8]

for i in range(len(arr)):
    min_idx = i # 가장 작은 원소의 인덱스
    for j in range(i+1, len(arr)):
        if arr[min_idx]>arr[j]:
            min_idx = j
    arr[i],arr[min_idx]=arr[min_idx],arr[i]
print('선택정렬 : ',arr)

# 삽입정렬
for i in range(1,len(arr)):
    for j in range(i,0-1): #i부터 1까지 1씩 감소하며 반복
        if arr[j]<arr[j-1]: # 한 칸씩 왼쪽으로 이동
            arr[j],arr[j-1] = arr[j-1],arr[j]
        else: # 자기보다 작은데이터를 만나면 그 위치에서 멈춤
            break
print('삽입정렬 : ',arr)

# 퀵 정렬 : 일반적인 방식

def quik_sort(arr,start,end):
    if start >= end: # 원소가 한개인 경우 종료
        return
    pivot = start # 피벗은 첫 번째 원소
    left = start+1
    right = end
    while(left<=right):
        # 피벗보다 큰 데이터를 찾을 때까지 반복
        while(left<=end and arr[left]<=arr[pivot]):
            left+=1
        # 피벗보다 작은 데이터를 찾을 때까지 반복
        while(right>start and arr[right]>arr[pivot]):
            right-=1
        if(left>right): # 엇갈렸다면 작은 데이터와 피벗을 교체
            arr[right],arr[pivot]=arr[pivot],arr[right]
        else: # 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            arr[left],arr[right]=arr[right],arr[left]
    #분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
    quik_sort(arr,start,right-1)
    quik_sort(arr,right+1,end)

quik_sort(arr,0,len(arr)-1)
print('퀵 정렬 : ',arr)

# 퀵 정렬 : 파이썬의 장점으 살린 방식
def quik_sort2(arr):
    #리스트가 하나 이하의 원소만을 담고 있다면 종료
    if len(arr) <= 1:
        return arr
    pivot=arr[0]
    tail=arr[1:] # 피벗을 제외한 arr

    left_side = [x for x in tail if x<=pivot] # 분할된 왼쪽 부분
    # List Comprehension -> [표현식 for 항목 in 순회 가능한 객체 if 조건문]
    # 표현식(x) : 순회하면서 각 항목에 대해 계산되는 값
    # 값항목(x) : 순회 가능한 객체에서 가져온 요소
    # 순회 가능한 객체 : 리스트, 튜플, 딕셔너리, 문자열 등과 같은 데이터 타입
    # 조건문 (옵션) : 항목에 대한 추가적인 필터링을 수행합
    #  ->순회 가능한 객체(tail)에서 각 항목(x)를 가져와서 조건문(x<=pivot)이 
    # True인 경우에만 표현식(x)을 계산해서 새로운 리스트(left_side)에 추가한다.
    # -->tail에서 항목x를 가져와서 x가 피벗보다 작거나 같으면 left_side 추가
    right_side = [x for x in tail if x > pivot] # 분할된 오른쪽 부분

    # 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행하고, 전체 리스트 반환
    return quik_sort2(left_side)+[pivot]+quik_sort2(right_side)

print('파이썬의 장점을 살린 퀵 정렬 : ',quik_sort2(arr))

# 계수 정렬 : 조건! 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때
# 동일한 값을 가지는 데이터가 여러개 등장할 때 효과적임 ex) 성적 정렬
# 모든 원소의 값이 0보다 크거나 같다고 가정
arr3=[7,5,9,0,3,1,6,2,9,1,4,8,5,2]
# 모든 범위를 포함하는 리스트 선언(모든 값은 0으로 초기화)
cnt = [0]*(max(arr3)+1)

for i in range(len(arr3)):
    cnt[arr3[i]]+=1 # 각 데이터에 해당하는 인덱스의 값 증가

for i in range(len(cnt)): # 리스트에 기록된 정렬 정보 확인
    for j in range(cnt[i]):
        print(i,end=' ') # 띄어쓰기를 구분으로 등장한 횟수만큼 인덱스 출력
        # end=' '는 출력 후 줄바꿈을 하지 않도록 설정

# 소요시간 : 선택 정렬 > 기본 정렬 라이브러리