import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N != 1) {
            while (!isPrime(N)) {
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        N /= i;
                        System.out.println(i);
                        break;
                    }
                }
            }
            System.out.println(N);
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}