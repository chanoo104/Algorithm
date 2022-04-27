from collections import deque


def dfs(n):
    print(n, end=" ")
    visited[n] = True
    for i in nodes[n]:
        if not visited[i]:
            dfs(i)


def bfs(n):
    queue = deque()
    queue.append(n)
    while queue:
        d = queue.popleft()
        if not visited[d]:
            print(d, end=" ")
            visited[d] = True
            queue.extend(nodes[d])


if __name__ == "__main__":
    N, V, M = map(int, input().split())
    nodes = [[] for _ in range(N + 1)]
    for i in range(V):
        a, b = map(int, input().split())
        nodes[a].append(b)
        nodes[b].append(a)
    for i in nodes:
        i.sort()
    visited = [False] * (N + 1)
    dfs(M)
    print()
    visited = [False] * (N + 1)
    bfs(M)
