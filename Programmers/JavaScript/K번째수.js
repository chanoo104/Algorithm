function solution(array, commands) {
    answer = [];
    commands.forEach((cmd) => {
        if (cmd[0] == cmd[1]) {
            answer.push(array[cmd[0] - 1]);
        } else {
            answer.push(array.slice(cmd[0] - 1, cmd[1]).sort((a, b) => a - b)[cmd[2] - 1]);
        }
    });
    return answer;
}
