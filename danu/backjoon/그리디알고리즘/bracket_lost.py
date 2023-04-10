s = input()

# '-' 기호를 만나면 뒤에 나오는 수를 모두 빼주기 위한 변수
minus = False

# 식에서 숫자와 연산자를 구분하여 리스트에 저장
num_list = []
op_list = []
tmp = ''
for i in range(len(s)):
    if s[i].isdigit():
        tmp += s[i]
    else:
        num_list.append(int(tmp))
        op_list.append(s[i])
        tmp = ''
num_list.append(int(tmp))

# '-' 기호 뒤에 나오는 수를 모두 빼주면서 식의 값을 최소로 만듦
result = num_list[0]
for i in range(len(op_list)):
    if op_list[i] == '-':
        minus = True
    if minus:
        result -= num_list[i+1]
    else:
        result += num_list[i+1]

print(result)