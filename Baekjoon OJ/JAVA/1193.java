import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, x = 0, y = 0, count = 0;
        boolean up = false;

        while (count != n) {
            if (up) {
                x = -1;
                y = cnt;
            } else {
                x = cnt;
                y = -1;
            }
            for (int i = 0; i < cnt; i++) {
                if (count == n) {
                    break;
                }
                if (up) {
                    x++;
                    y--;
                } else {
                    x--;
                    y++;
                }
                count++;
            }
            up = !up;
            cnt++;
        }
        System.out.println((y + 1) + "/" + (x + 1));


    }
}