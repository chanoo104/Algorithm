import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, avg, over_avg=0;
        int[] score = new int[1000];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int d = sc.nextInt();
                sum += d;
                score[j] = d;
            }
            avg = sum / k;
            for(int d : score){
                if(avg < d){
                    over_avg++;
                }
            }
            System.out.printf("%.3f", (double) over_avg/k*100.0);
            System.out.println("%");
            score = new int[1000];
            sum = 0;
            avg = 0;
            over_avg = 0;
        }

    }
}
