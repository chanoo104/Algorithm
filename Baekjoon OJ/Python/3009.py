x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())
x3, y3 = map(int, input().split())

if x1 == x2:
    print(x3, end=" ")
else:
    print(x2, end=" ") if x1 == x3 else print(x1, end=" ")

if y1 == y2:
    print(y3, end=" ")
else:
    print(y2, end=" ") if y1 == y3 else print(y1, end=" ")