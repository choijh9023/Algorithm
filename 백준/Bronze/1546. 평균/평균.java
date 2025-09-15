

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }


        double sum = 0;
       
        for (int i = 0; i < arr.length; i++) {
           
            sum += (double)arr[i]/max*100;

        }
        System.out.println(sum / arr.length);

    }


}

