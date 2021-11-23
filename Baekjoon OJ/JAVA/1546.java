import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int max = 0;
        double total = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a>max)
                max = a;
            nums[i] = a;
        }
        for (int c : nums){
            double s = (double)c/max*100.0;
            total += s;

        }
        System.out.println(total/n);


    }
}
