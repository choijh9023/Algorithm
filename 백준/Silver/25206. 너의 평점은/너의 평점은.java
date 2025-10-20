import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //
        double totalScore = 0.0;
        double totalCredit = 0.0;
        double subScore = 0.0;
        for (int i = 0 ; i< 20; i ++){
            String line = br.readLine(); // 과목 +  학점 + 과목 평점
            StringTokenizer st = new StringTokenizer(line);
            String subject = st.nextToken(); // 과목
            double score = Double.parseDouble(st.nextToken()); // 학점
            String average = st.nextToken();

            if(average.charAt(0)=='P')continue;
switch (average) {
    case "A+":
        subScore = 4.5;
        break;
    case "A0":
        subScore = 4.0;
        break;
    case "B+":
        subScore = 3.5;
        break;
    case "B0":
        subScore = 3.0;
        break;
    case "C+":
        subScore = 2.5;
        break;
    case "C0":
        subScore = 2.0;
        break;
    case "D+":
        subScore = 1.5;
        break;
    case "D0":
        subScore = 1.0;
        break;
    case "F":
        subScore = 0.0;
        break;
}
            totalScore += score * subScore;
            totalCredit+=score;


        }

        double averageScore = totalScore / totalCredit;
        System.out.format("%.6f", averageScore);

    }
}
