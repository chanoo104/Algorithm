import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.nextInt());
        String b = String.valueOf(sc.nextInt());

        StringBuilder aa = new StringBuilder();
        StringBuilder bb = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            aa.append(a.charAt(i));
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            bb.append(b.charAt(i));
        }
        if(Integer.parseInt(aa.toString()) > Integer.parseInt(bb.toString()))
            System.out.println(aa);
        else
            System.out.println(bb);
    }
}


