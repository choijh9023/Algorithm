
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String normal = new String(br.readLine());
        String reverse = new StringBuffer(normal).reverse().toString();
        if(normal.equals(reverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}