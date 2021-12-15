N = int(input())

n = 0
currentNum = 0

while N != n:
    currentNum += 1
    if str(currentNum).find('666') != -1:
        n += 1

print(currentNum)
