while True:
    a, b, c = map(int, input().split())
    if a == 0 and b == 0 and c == 0:
        break
    if a < b:
        if b < c:
            print("right") if c * c == a * a + b * b else print("wrong")
        else:
            print("right") if b * b == a * a + c * c else print("wrong")
    else:
        print("right") if a * a == b * b + c * c else print("wrong")