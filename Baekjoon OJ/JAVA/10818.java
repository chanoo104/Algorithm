import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max=-1000001, min=1000001;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(max<x)
                max=x;
            if(min>x)
                min=x;
        }
        System.out.println(min + " " + max);
    }
}
