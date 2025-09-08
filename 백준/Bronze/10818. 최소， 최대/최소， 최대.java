import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int [] intarray = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
       intarray[0] = Integer.parseInt(st.nextToken());
        int min = intarray[0];
        int max = intarray[0];
        for (int i = 1; i < a; i++) {

            intarray[i] = Integer.parseInt(st.nextToken());

            if(intarray[i]<min){
                min=intarray[i];
            }
            if(intarray[i]>max){
                max=intarray[i];
            }

        }
        System.out.print(min+" "+max);
    }
}
