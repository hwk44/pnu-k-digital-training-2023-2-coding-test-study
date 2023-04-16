# 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
# 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

n = str(input())
# 문자열로 입력받은 숫자의 각 단위를 리스트에 저장
num = []
for i in n:
    num += i
# 각 숫자들을 내림차순으로 정렬
sort_numlist = sorted(num, reverse=True)
# 다시 하나의 숫자로 만들기
sort_num = ''.join(sort_numlist)
print(int(sort_num))
