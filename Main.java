import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int distance = y - x;
            int count;
            int max = (int) Math.sqrt(y - x);
            if (max == Math.sqrt(distance)) {
                count = max * 2 - 1;
            } else {
                if (distance <= max * max + max) {
                    count = max * 2;
                } else {
                    count = max * 2 + 1;
                }
            }
            System.out.println(count);
        }
    }
}