import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, f = sc.nextInt(), n = f, cnt=0;
        do {
            if (n < 10) {
                a = 0;
            } else {
                a = n % 100 / 10;
            }
            n = ((n % 10)* 10) + ((a+(n % 10)) % 10);
            cnt++;
        } while (f != n);
        System.out.println(cnt);
    }
}
