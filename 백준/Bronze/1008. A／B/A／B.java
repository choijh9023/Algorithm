import java.util.*;
import java.io.*;

class Main{

public static void main(String []args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    Double C = (double)A/B;
    System.out.printf("%.9f",C);
}
}