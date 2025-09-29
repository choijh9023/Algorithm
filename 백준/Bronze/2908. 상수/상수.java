

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(st.nextToken());
        sb2.append(st.nextToken());
        sb.reverse();
        sb2.reverse();
        int first = Integer.parseInt(String.valueOf(sb));
        int second = Integer.parseInt(String.valueOf(sb2));

        if (first < second) {
            System.out.println(second);
        }else {
            System.out.println(first);
        }

    }
}
