import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s = Integer.parseInt(st.nextToken());
        for (int i = s; i <=s; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(s + " * " + j + " = " + s*j);
            }

        }
    }
}
