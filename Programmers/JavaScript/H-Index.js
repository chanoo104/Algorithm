function solution(citations) {
    cnt = 0;
    citations
        .sort((a, b) => b - a)
        .forEach((e) => {
            if (cnt <= e) cnt++;
        });
    return cnt;
}

console.log(solution([3, 0, 6, 1, 5]));
