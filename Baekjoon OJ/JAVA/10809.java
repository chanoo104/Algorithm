import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean found = false;
        for (int j = 97; j <= 122; j++) {
            for (int i = 0; i < s.length(); i++) {
                if ((int) s.charAt(i) == j) {
                    System.out.print(i + " ");
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print("-1 ");
            }
            found = false;
        }


    }
}