import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int max = 0;
        int temp = 0;
        int answer = 0;
        for(int a = 1; a <= 9; a++ ){
            num = Integer.parseInt(br.readLine());        
            if(max<num){
                max = num;
                answer = a;
            }
        }
        System.out.println(max);
        System.out.println(answer);
        
    }
}