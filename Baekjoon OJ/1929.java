import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] s = isPrime(N);
        for (int i = M; i <= N; i++) {
            if (s[i]) {
                System.out.println(i);
            }
        }
    }

    static boolean[] isPrime(int a) {
        boolean[] list = new boolean[a+1];
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