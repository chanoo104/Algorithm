import itertools

T, M = map(int, input().split())
cards = list(map(int, input().split()))

MAX_NUM = 0

card = list(itertools.combinations(range(T), 3))
for i in card:
    sums = cards[i[0]] + cards[i[1]] + cards[i[2]]
    if MAX_NUM < sums <= M:
        MAX_NUM = sums

print(MAX_NUM)
