import itertools
def solution(answers):
    people = [0, 0, 0]
    answer = []
    first = itertools.cycle([1, 2, 3, 4, 5])
    second = itertools.cycle([2, 1, 2, 3, 2, 4, 2, 5])
    third = itertools.cycle([3, 3, 1, 1, 2, 2, 4, 4, 5, 5])

    for i in range(len(answers)):
        if answers[i] == next(first):
            people[0] += 1
        if answers[i] == next(second):
            people[1] += 1
        if answers[i] == next(third):
            people[2] += 1
    for i, j in enumerate(people):
        if j == max(people):
            answer.append(i + 1)
    return answer


if __name__ == '__main__':
    print(solution([1, 3, 2, 4, 2, 3, 3, 3, 3, 3, 3, 3, 3]))
