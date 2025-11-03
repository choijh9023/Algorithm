
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 이건 2차원 배열로 못풀거같은데? 가로 배열의 길이가 서로 다를 수 있기때문?
        char [][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            // 만약 [][n] 값이 없는 2차원 배열 isempty null 삽입
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);

            }
        }
        //출력문

        for (int j = 0; j < 15; j++) {

            for (int i = 0; i < 5; i++) {
                if(arr[i][j]!='\0')System.out.print(arr[i][j])
                ;
            }
        }
    }
}
