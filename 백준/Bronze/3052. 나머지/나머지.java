
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int line = Integer.parseInt(br.readLine());
            int a = line%42;
            arr[i] = a;
        }
      int[] newarr = Arrays.stream(arr).distinct().toArray();


        System.out.println(newarr.length);
    }
}
