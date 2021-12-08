import sys

N = int(input())

i = 1
while i < 1000000:
    if N == i + sum(map(int, str(i))):
        print(i)
        sys.exit()
    i += 1
print(0)
