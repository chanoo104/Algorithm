function solution(brown, yellow) {
    for (h = 3; h <= brown; h++) {
        if ((brown + yellow) % h == 0) {
            if (((brown + yellow) / h - 2) * (h - 2) == yellow) {
                return [(brown + yellow) / h, h];
            }
        }
    }
}
