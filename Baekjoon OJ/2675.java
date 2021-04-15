import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            String k = sc.next();
            for (int l = 0; l < k.length(); l++) {
                for (int m = 0; m < j; m++) {
                    System.out.print(k.charAt(l));
                }
            }
            System.out.println();
        }
    }
}


