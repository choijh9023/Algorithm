import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }



        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine()); // 새로운 줄 읽기
            int m  = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int start = m-1;
            int end = n-1;
            while (start<end ) {
                int temp =arr[start];
                arr[start] =  arr[end];
                arr[end] = temp;
                start++;
                end--;

            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        }
}
