import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * 25년 9월 9일
 * - 1번부터  n번까지의 숫자가 적힌 바구니들이 있다
 * - 1번 부터 n번까지 적혀있는 공울 매우 많이 가지고 있다.
 * - 첫 바구니에는 공이 안들어가고, 각 바구니에는 1개의 공만 넣을 수 있다.
 *
 */
public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        for (int a = 1; a <=m; a++) {
           String nextline =  br.readLine();
           st = new StringTokenizer(nextline);
           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
            for (int l = i; l <=j; l++) {

                arr[l-1] = k;
            }

        }

        for (int i : arr) {
            System.out.print(i +  " ");
        }



    }
}
