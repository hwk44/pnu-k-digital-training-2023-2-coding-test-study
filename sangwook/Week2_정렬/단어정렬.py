# 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
# 1. 길이가 짧은 것부터
# 2. 길이가 같으면 사전 순으로
# 단, 중복된 단어는 하나만 남기고 제거해야 한다.

import sys

n = int(input())
# 중복 방지를 위해 set에다 단어들을 넣어 준다.
words = set()
for _ in range(n):
    # 줄바꿈 문자 제거
    word = sys.stdin.readline().strip()
    words.add(word)
# 집합을 리스트로 정렬.
wordlist = list(words)
# 리스트를 여러 조건으로 정렬하려면, 키값을 튜플 형태로, 먼저 적용할 조건부터 적어 준다.
# (길이 순 정렬, 기본 정렬)
lst1 = sorted(wordlist, key=lambda x: (len(x), x))
# 출력
for i in range(len(lst1)):
    print(lst1[i])

