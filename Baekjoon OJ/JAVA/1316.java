import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String[] word = new String[n];
        boolean[] alphabet = new boolean[26];
        boolean is_group = false;

        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                int a = word[i].charAt(j) - 97;
                if (j == 0) {
                    alphabet[a] = true;
                }
                if (j != 0) {
                    if (word[i].charAt(j) != word[i].charAt(j - 1) && !alphabet[a]) {
                        alphabet[a] = true;
                    } else if (word[i].charAt(j) != word[i].charAt(j - 1) && alphabet[a]) {
                        alphabet[a] = false;
                        is_group = true;
                    }
                }
            }
            if (!is_group) {
                sum++;
            } else
                is_group = false;
            alphabet = new boolean[26];

        }

        System.out.println(sum);

    }
}