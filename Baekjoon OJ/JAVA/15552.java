import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(bf.readLine());
            for (int i = 0; i < n; i++) {
                String num = bf.readLine();
                int a = Integer.parseInt(num.split(" ")[0]);
                int b = Integer.parseInt(num.split(" ")[1]);
                bw.write(String.valueOf(a+b));
                bw.newLine();
            }
            bw.flush();
            bw.close();
    }
}
