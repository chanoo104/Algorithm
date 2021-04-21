import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] apt = new int[15][15];
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }
        int sum = 0;
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j <= 15; j++) {
                for (int k = 0; k < j; k++) {
                    sum += apt[i - 1][k];
                }
                apt[i][j-1] = sum;
                sum = 0;
            }
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}