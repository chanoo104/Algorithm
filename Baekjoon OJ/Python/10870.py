import sys

sys.setrecursionlimit(10 ** 6)

N = int(input())


def fibo(num):
    if num == 0:
        return 0
    if num == 1:
        return 1
    return fibo(num - 2) + fibo(num - 1)


print(fibo(N))
