

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toUpperCase(); // 입력 받자마자 대문자로 변경

        // 알파벳 개수를 저장할 배열 (A-Z -> 0-25)
        int[] alphabetCount = new int[26];

        // 문자열을 순회하며 알파벳 개수 카운트 (O(N) 시간 복잡도)
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            alphabetCount[c - 'A']++; // 'A'는 0번, 'B'는 1번 인덱스에 카운트
        }

        int maxCount = -1;
        char answer = '?';

        // 가장 많이 사용된 알파벳 찾기 (고정 26번 순회)
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                answer = (char) (i + 'A'); // 인덱스를 다시 알파벳으로 변환
            } else if (alphabetCount[i] == maxCount) {
                // maxCount와 같은 값이 또 나오면, 여러 개라는 의미이므로 '?'
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}