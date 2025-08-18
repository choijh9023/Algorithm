import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
      
       
        for(int a = 1; a <=n;a ++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            System.out.printf("Case #%d: %d + %d = %d\n",a,b,c,b+c);
        }
       
        
        
   
    }
}