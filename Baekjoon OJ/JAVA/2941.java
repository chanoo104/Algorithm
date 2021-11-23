import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        n = n + "   ";

        int total = 0;

        for (int i = 0; i < n.length(); i++) {

            if (n.charAt(i) == 'c' && n.charAt(i + 1) == '=') {
                i++;
            } else if (n.charAt(i) == 'c' && n.charAt(i + 1) == '-') {
                i++;
            } else if (n.charAt(i) == 'd' && n.charAt(i + 1) == 'z' && n.charAt(i + 2) == '=') {
                i += 2;
            } else if (n.charAt(i) == 'd' && n.charAt(i + 1) == '-') {
                i++;
            } else if (n.charAt(i) == 'l' && n.charAt(i + 1) == 'j') {
                i++;
            } else if (n.charAt(i) == 'n' && n.charAt(i + 1) == 'j') {
                i++;
            } else if (n.charAt(i) == 's' && n.charAt(i + 1) == '=') {
                i++;
            } else if (n.charAt(i) == 'z' && n.charAt(i + 1) == '=') {
                i++;
            }
            if(n.charAt(i) != ' ')
                total++;
        }
        System.out.println(total);
    }
}