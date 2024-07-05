
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력기 구현
        String str = bf.readLine();
        Stack<Character> stack = new Stack<>();
        boolean inTag = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '<') {
                // 태그가 시작되면, 스택에 있는 모든 문자를 출력하고 태그 모드로 전환
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                inTag = true;
                System.out.print(currentChar);
            } else if (currentChar == '>') {
                // 태그가 끝나면 태그 모드를 해제
                inTag = false;
                System.out.print(currentChar);
            } else if (inTag) {
                // 태그 안의 내용은 그대로 출력
                System.out.print(currentChar);
            } else {
                // 태그 밖의 내용 처리
                if (currentChar == ' ') {
                    // 공백을 만나면 스택에 있는 모든 문자를 출력하고 공백 출력
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(currentChar);
                } else {
                    // 단어의 문자는 스택에 푸시
                    stack.push(currentChar);
                }
            }
        }

        // 마지막으로 스택에 남아있는 모든 문자 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
