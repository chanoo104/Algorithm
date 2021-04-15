import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if(b=='A')
                sum+=3;
            if(b=='B')
                sum+=3;
            if(b=='C')
                sum+=3;
            if(b=='D')
                sum+=4;
            if(b=='E')
                sum+=4;
            if(b=='F')
                sum+=4;
            if(b=='G')
                sum+=5;
            if(b=='H')
                sum+=5;
            if(b=='I')
                sum+=5;
            if(b=='J')
                sum+=6;
            if(b=='K')
                sum+=6;
            if(b=='L')
                sum+=6;
            if(b=='M')
                sum+=7;
            if(b=='N')
                sum+=7;
            if(b=='O')
                sum+=7;
            if(b=='P')
                sum+=8;
            if(b=='Q')
                sum+=8;
            if(b=='R')
                sum+=8;
            if(b=='S')
                sum+=8;
            if(b=='T')
                sum+=9;
            if(b=='U')
                sum+=9;
            if(b=='V')
                sum+=9;
            if(b=='W')
                sum+=10;
            if(b=='X')
                sum+=10;
            if(b=='Y')
                sum+=10;
            if(b=='Z')
                sum+=10;

        }
        System.out.println(sum);
    }
}