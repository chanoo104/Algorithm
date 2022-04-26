A, B = map(int, input().split())
B += int(input())
if B >= 60:
    B -= 60
    A += 1
if A >= 24:
