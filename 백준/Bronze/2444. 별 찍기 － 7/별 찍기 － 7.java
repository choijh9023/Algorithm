
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        for (int i = 0; i < count; i++) {
            for (int j = count-1; j > i; j--) {
                System.out.print(" ");
            } for (int k = 0; k <= 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = count-2; i >= 0; i--) {
            for (int j = count-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
