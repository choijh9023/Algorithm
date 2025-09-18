import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] positions = new int[26]; // 알파벳 개수만큼 배열 생성
        for (int i = 0; i < 26; i++) {
            positions[i] = -1; // 초기값은 -1
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a'; // 'a'부터 몇 번째인지 계산
            if (positions[idx] == -1) {
                positions[idx] = i; // 처음 등장한 위치 저장
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
