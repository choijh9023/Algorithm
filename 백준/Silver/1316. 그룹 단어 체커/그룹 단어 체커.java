import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            boolean isGroup = true;
            for (int j = 1; j < line.length(); j++) {
                if(line.charAt(j)!= line.charAt(j-1)){

                    for (int k = 0; k < j-1; k++) {
                        if(line.charAt(k)==line.charAt(j)){
                            isGroup = false;
                            break;
                        }
                    }
                }

            }
            if(isGroup)answer++;


        }
        System.out.println(answer);
    }
}
