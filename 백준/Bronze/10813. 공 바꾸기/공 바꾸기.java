

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한줄 입력 받고
        int n = Integer.parseInt(st.nextToken()); // n 값 저장
        int m = Integer.parseInt(st.nextToken());//  m 값 저장

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for (int j = 0; j < m; j++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            int i = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            int temp;
            temp = arr[i];
            arr[i] = arr[b];
            arr[b] = temp;
        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }



    }





}
