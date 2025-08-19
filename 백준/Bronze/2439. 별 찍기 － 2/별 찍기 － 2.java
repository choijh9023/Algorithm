import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(bf.readLine());

        for(int i = 1; i<=sum; i++){
            for(int j = 0; j<sum-i; j++){
                System.out.print(" ");
            }
            for(int k =0 ; k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}