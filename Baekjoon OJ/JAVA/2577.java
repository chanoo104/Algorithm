import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * sc.nextInt() * sc.nextInt();
        String f = String.valueOf(n);
        int[] cnt = new int[10];
        for (int i = 0; i < f.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                int il = Integer.parseInt(String.valueOf(f.charAt(i)));
                if (j == il)
                    cnt[j]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i]);
        }


    }
}
