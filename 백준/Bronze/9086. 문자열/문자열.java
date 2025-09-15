import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
        while(0<t){
            t--;
            String line = br.readLine();
            char a = line.charAt(0);
            char b = line.charAt(line.length()-1);
            System.out.printf("%c%c\n",a,b);

        }

    }



}
