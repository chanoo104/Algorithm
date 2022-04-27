from collections import deque
import sys

N = int(sys.stdin.readline().rstrip())
q = deque()
for _ in range(N):
    cmd = sys.stdin.readline().rstrip()
    if "push" in cmd:
        q.append(int(cmd.split()[1]))
    elif "pop" in cmd:
        if len(q) == 0:
            print(-1)
        else:
            print(q.popleft())
    elif "size" in cmd:
        print(len(q))
    elif "empty" in cmd:
        if len(q) == 0:
            print(1)
        else:
            print(0)
    elif "front" in cmd:
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])
    elif "back" in cmd:
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])
