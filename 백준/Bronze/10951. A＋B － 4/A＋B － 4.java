import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line; // 읽어온 한 줄을 저장할 변수

        // bf.readLine()의 결과가 null이 아닐 동안, 즉 읽어올 줄이 있는 동안 계속 반복
        while ((line = bf.readLine()) != null) {
            // 빈 줄이 들어올 경우를 대비 (필수는 아님)
            if (line.isEmpty()) {
                break;
            }
            
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a + b);
        }
    }
}