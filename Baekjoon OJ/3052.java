import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList nums = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt()%42;
            for (int j = 0; j < 10; j++) {
                if(!nums.contains(n))
                    nums.add(n);
            }
        }
        System.out.println(nums.size());
        

    }
}
