import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        System.out.println(bi1.add(bi2));
    }
}