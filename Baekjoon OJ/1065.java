import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            if (Hans(i))
                sum++;
        }
        System.out.println(sum);
    }

    static Boolean Hans(int a) {
        String s = String.valueOf(a);
        if (s.length() < 3)
            return true;
        if (s.length() == 3)
            return ((int) s.charAt(0) - (int) s.charAt(1)) == ((int) s.charAt(1) - (int) s.charAt(2));
        return false;
    }
}