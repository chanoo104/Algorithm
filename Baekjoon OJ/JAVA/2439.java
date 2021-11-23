import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {

            for (int j = 0; j < n-k; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
