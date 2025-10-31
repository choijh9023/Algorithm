
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력기 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[][] = new int[9][9];
        int max = Integer.MIN_VALUE;
        int column = 0;
        int row = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 한번 받으면서 st로 다 짜르기
            for(int j = 0 ; j <9 ; j++){

                int data = Integer.parseInt(st.nextToken());
                array[i][j] = data;

                if(max<data){
                    max = data;
                    row = i+1;
                    column = j+1;
                }

            }
        }
        System.out.println(max);
        System.out.printf("%d %d",row,column);  //




        // 배열 선언

        // 배열에 값 넣기

        // 값 순회하면서 큰 수 찾기


    }
}
