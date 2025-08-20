import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        List<Integer> answer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {

            int a = Integer.parseInt(st.nextToken());
            answer.add(a);
        }
        int v = Integer.parseInt(bf.readLine());
        long count = answer.stream().filter(i -> i == v).count();
        int a = (int)count;
        System.out.println(a);
    }
    }
