import sys
input = sys.stdin.readline
print = sys.stdout.write
N = int(input())
nums = []
for _ in range(N):
    nums.append(int(input()))
nums.sort()
print('\n'.join(map(str, nums)))
