import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int maxl = 0;
        for (int i = 1; i < 10; i++) {
            int d =sc.nextInt();
            if(max < d) {
                max = d;
                maxl = i;
            }
        }
        System.out.println(max + "\n" + maxl);
    }
}
