import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private String name;
    private int age;
    private int weight;

    public Main(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // 회원의 분류를 반환하는 메서드
    public String getClassification() {
        if (age > 17 || weight >= 80) {
            return "Senior";
        } else {
            return "Junior";
        }
    }
    // 회원 정보를 출력하는 메서드
    public void printInfo() {
        System.out.println(name + " " + getClassification());
    }


    public static void main(String[] args) throws IOException {
        List<Main> members = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (name.equals("#") && age == 0 && weight == 0) break;

            // 회원 객체 생성 및 리스트에 추가
            members.add(new Main(name, age, weight));
        }

        // 모든 회원 정보 출력
        for (Main member : members) {
            member.printInfo();
        }
    }
}