function solution(n, lost, reserve) {
    a = [];
    for (i = 0; i < n; i++) {
        a.push(true);
    }
    lost.forEach((e) => {
        a[e - 1] = false;
    });
    reserve.forEach((e) => {
        if (lost[e - 1] == reserve[e - 1]) {
            a[e - 1] = true;
        } else {
            if ((e - 2 != -1) & !a[e - 2]) {
                a[e - 2] = true;
            } else if ((e + 1 > n) & !a[e + 1]) {
                a[e + 1] = true;
            }
        }
    });
    var answer = 0;
    return a;
}

console.log(solution(5, [2, 4], [1, 3, 5]));
