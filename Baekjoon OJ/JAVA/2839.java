import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out = n;
        for (int i = 0; i <= n / 5; i++) {
            for (int j = 0; j <= n / 3; j++) {
                if (i * 5 + j * 3 == n && i + j <= out)
                    out = i + j;
            }
        }
        if (out == n)
            out = -1;
        System.out.println(out);
    }
}