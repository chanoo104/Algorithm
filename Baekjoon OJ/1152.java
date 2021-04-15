import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int space = 0, sum = 0;
        if (s.charAt(0) == 32)
            space++;
        if (s.charAt(s.length() - 1) == 32)
            space++;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                sum++;
        }
        System.out.println(sum - space + 1);
    }
}


