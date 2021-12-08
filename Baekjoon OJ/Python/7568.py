N = int(input())
dungchi = []
for _ in range(N):
    dungchi.append(tuple(map(int, input().split())))
rank = [1 for i in range(N)]
for i in range(N):
    for j in range(N):
        if dungchi[i][0] < dungchi[j][0] and dungchi[i][1] < dungchi[j][1]:
            rank[i] += 1
print(' '.join(map(str, rank)))
