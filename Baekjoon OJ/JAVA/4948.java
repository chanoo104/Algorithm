import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] s = isPrime(246912);
        while (true) {
            int N = sc.nextInt();
            if (N == 0)
                break;
            int sum = 0;
            for (int i = N + 1; i <= N * 2; i++) {
                if (s[i]) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
    static boolean[] isPrime(int a) {
        boolean[] list = new boolean[a + 1];
        for (int i = 0; i <= a; i++) {
            list[i] = true;
        }
        list[1] = false;
        for (int i = 2; i * i <= a; i++) {
            if (!list[i]) continue;
            for (int j = i * i; j <= a; j += i) {
                list[j] = false;
            }
        }
        return list;
    }
}