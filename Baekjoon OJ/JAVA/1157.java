import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] a = new int[26];
        int[] max = new int[26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= 25; j++) {
                if((int)s.charAt(i) == j+65) {
                    a[j]++;
                    max[j]++;
                }
            }
        }
        Arrays.sort(max);

        if(max[max.length-1] == max[max.length-2]) {
            System.out.println("?");
            System.exit(0);
        }else{
            for (int i = 0; i < a.length; i++) {
                if(a[i] == max[max.length-1])
                    System.out.println((char)(i+65));
            }
        }
    }
}


