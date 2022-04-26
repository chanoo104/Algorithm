from collections import Counter

N = int(input())
nums = []
for _ in range(N):
    nums.append(int(input()))
nums.sort()


def getmode(n):
    data = Counter(n).most_common()
    if len(data) == 1:
        return data[0][0]
    elif data[0][1] == data[1][1]:
        return data[1][0] if data[0][0] < data[0][1] else data[0][0]


print(round(sum(nums) / len(nums)))
print(nums[int(len(nums) / 2)])
print(getmode(nums))
print(max(nums) - min(nums))
