import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력기 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int answer = 0;
        for(int i = 0; i < line.length(); i++) {
            if (' ' == line.charAt(i)) {
                answer++;
            }
        }
        if(line.charAt(line.length()-1) == ' '){
            answer--;
        }
        if (line.charAt(0) == ' ') {
            answer--;
        }
        System.out.println(answer+1);
    }
}
