import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int H = 0, W = 0, N = 0;
        for (int i = 0; i < n; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
            int h = 0, w = 1;
            for (int cnt = 0; cnt < N; cnt++) {
                if (h < H)
                    h++;
                else {
                    h = 1;
                    w++;
                }
            }
            System.out.printf("%d%02d", h, w);
            System.out.println();
        }
    }
}