import java.util.*;
import java.io.*;

class Main{
    public static void main (String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for(int i = 0; i < A; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            System.out.println(B + C);
        }
    }
}
