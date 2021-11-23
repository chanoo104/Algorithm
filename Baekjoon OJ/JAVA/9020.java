import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] list = isPrime(10000);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int a = N / 2, b = N / 2;
            while (true) {
                if (list[a] & list[b]) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }

    public static boolean[] isPrime(int a) {
        boolean[] list = new boolean[a + 1];
        for (int i = 0; i <= a; i++) {
            list[i] = true;
        }
        list[0] = list[1] = false;
        for (int i = 2; i <= (int)Math.sqrt(a); i++) {
            if (!list[i])
                continue;
            for (int j = i * i; j <= a; j += i) {
                list[j] = false;
            }
        }
        return list;
    }
}