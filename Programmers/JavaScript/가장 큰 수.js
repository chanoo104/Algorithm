function solution(numbers) {
    answer = numbers.sort((a, b) => parseInt(b.toString() + a.toString()) - parseInt(a.toString() + b.toString())).join("");
    return answer[0] == "0" ? "0" : answer;
}

console.log(solution([0, 0, 0]));
console.log(solution([6, 10, 2]));
