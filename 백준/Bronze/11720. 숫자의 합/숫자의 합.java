
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String []args)throws IOException{

        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int [] intarr = new int[n];
        int sum = 0;
        for(int i = 0 ; i<n ; i++){

            //substring는 파라미터에서 i, i+1이라는 코드에 결과는
            // i 번인덱스를 포함 하고 i-1번은 제외한 그 사이에 숫자만 넣는다느뜻이다 .
            intarr[i] = Integer.parseInt(line.substring(i,i+1));
            //System.out.println(intarr[i]);
            sum+= intarr[i];
        }
        System.out.println(sum);

    }
}