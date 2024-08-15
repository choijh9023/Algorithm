import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int job = Integer.parseInt(bf.readLine().trim());
        int total = h*60 + m+job;

        if(total<0){
            total+=1440;
        }
        h = (total/60)%24;
        m = total%60;
     

        System.out.printf("%d %d",h,m);

    }

}




