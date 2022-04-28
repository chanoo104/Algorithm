function isPrime(num) {
    if (num < 2) {
        return false;
    }
    for (let i = 2; i <= Math.floor(Math.sqrt(num)); i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

function permutation(arr, num) {
    const res = [];
    if (num == 1) {
        return arr.map((v) => [v]);
    }
    arr.forEach((v, idx, arr) => {
        const r = [...arr.slice(0, idx), ...arr.slice(idx + 1)];
        const p = permutation(r, num - 1);
        const a = p.map((d) => [v, ...d]);
        res.push(...a);
    });
    return res;
}

function solution(numbers) {
    data = new Set();
    s = numbers.split("");
    for (i = 1; i < s.length + 1; i++) {
        permutation(s, i).forEach((x) => {
            t = x.join("");
            if (isPrime(t)) {
                data.add(Number(t));
            }
        });
    }
    return data.size;
}

console.log(solution("17"));
