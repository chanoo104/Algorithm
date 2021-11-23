import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
            cnt = 0;
            sum = 0;
        }


    }
}
