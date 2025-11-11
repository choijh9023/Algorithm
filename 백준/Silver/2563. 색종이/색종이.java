
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paperNum = Integer.parseInt(br.readLine());

        int [][] square = new int [paperNum][2];
        for (int i = 0; i < paperNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {

                square[i][j] = Integer.parseInt(st.nextToken());

            }
        }
        int answer = 0;
        boolean [][]paper = new boolean[100][100];
        for (int i = 0; i < paperNum; i++) {
            for (int j = square[i][0]; j < square[i][0]+10;j++) {
                for (int k = square[i][1]; k < square[i][1]+10;k++) {
                    paper[j][k] = true;
                }


            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(paper[i][j]) answer++;
            }
        }
        System.out.println(answer);



    }
}
