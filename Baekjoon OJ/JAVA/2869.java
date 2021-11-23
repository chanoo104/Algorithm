import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = bf.readLine().split(" ");

        double A = Integer.parseInt(str[0]);
        double B = Integer.parseInt(str[1]);
        double V = Integer.parseInt(str[2]);

        bw.write(String.valueOf((int)Math.ceil((V-B)/(A-B))));
        bw.flush();
        bw.close();
    }
}