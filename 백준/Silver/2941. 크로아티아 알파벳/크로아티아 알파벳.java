
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {

            if(input.charAt(i)=='c'){
                if( i <= input.length()-2){
                if(input.charAt(i+1)=='=' || input.charAt(i+1)=='-'){
                    i++;
                    answer++;
                    continue;
                }}
            } else if (input.charAt(i)=='d') {
                if(i<=input.length()-2){
                if(input.charAt(i+1)=='-'){
                    i++;
                    answer++;
                    continue;
                }else if(i <= input.length()-3 && input.charAt(i+1)=='z' && input.charAt(i+2)=='='){
                    i+=2;
                    answer++;
                    continue;
                }}
            }else if(input.charAt(i)=='l' || input.charAt(i)=='n'){
                if(i<=input.length()-2){
                if(input.charAt(i+1)=='j'){
                    i++;
                    answer++;
                    continue;
                }}
            }else if(input.charAt(i)=='s'||input.charAt(i)=='z'){
                if(i<=input.length()-2){
                if(input.charAt(i+1)=='='){
                    i++;
                    answer++;
                    continue;
                }}
            }
            answer++;
        }
        
        System.out.println(answer);
    }
}
