

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken(); // B진법 수 N (문자열)
        int b = Integer.parseInt(st.nextToken()); // 진법 B

        long answer = 0; // 10진법 결과값 (최대 10억이므로 long 권장)
        long tmp = 1;    // 자릿수 가중치 (B^0, B^1, B^2 ...)

        // 1. 문자열의 맨 뒤(오른쪽)부터 맨 앞(왼쪽)까지 반복
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int num;

            // 2. 문자를 숫자로 변환하는 로직
            if (c >= 'A' && c <= 'Z') {
                // 알파벳인 경우: A=10, B=11 ... Z=35
                num = c - 'A' + 10;
            } else {
                // 숫자인 경우: '0'=0, '1'=1 ...
                num = c - '0';
            }

            // 3. 현재 자릿수의 값(num)에 가중치(tmp)를 곱해서 결과에 누적
            answer += num * tmp;

            // 4. 다음 자릿수를 위해 가중치에 b를 곱함 (예: 1 -> 36 -> 1296 ...)
            tmp *= b;
        }

        System.out.println(answer);
    }
}