public class Main {
    private static int selfNum(int n) {
        int v = n;
        int num = n;
        while (num > 0) {
            v += num % 10;
            num /= 10;
        }
        return v;
    }

    public static void main(String[] args) {
        boolean[] sf = new boolean[10000];

        for (int i = 0; i < 10000; i++) {
            int selfNum = selfNum(i);
            if (selfNum < 10000) {
                sf[selfNum(i)] = true;
            }

        }
        for (int i = 0; i < 10000; i++) {
            if (!sf[i]) {
                System.out.println(i);
            }
        }
    }
}