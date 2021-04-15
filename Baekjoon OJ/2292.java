import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int room = 1;
        int a = 1;
        while (room<n){
            room += a*6;
            a++;
        }
        System.out.println(a);
    }
}
