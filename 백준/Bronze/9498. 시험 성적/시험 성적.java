import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public String test() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());

        if ((100 >= x) && (x >= 90)) {

            return "A";
        } else if ((89 >= x) && (x >= 80)) {
            return "B";
        } else if ((79 >= x) && (x >= 70)) {
            return "C";
        } else if((69 >= x) && (x >= 60)){
            return "D";
        }
        return "F";
    }

    public static void main(String[] args) throws IOException {

        Main test = new Main();

        System.out.println(test.test());

    }

}
