import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 숫자를 입력 받음
        String num1 = br.readLine().trim();
        // 두 번째 숫자를 입력 받음
        String num2 = br.readLine().trim();

        // 첫 번째 숫자를 정수로 변환
        int a = Integer.parseInt(num1);
        // 두 번째 숫자를 정수로 변환
        int b = Integer.parseInt(num2);

        // 두 번째 숫자의 각 자리 숫자를 사용하여 첫 번째 숫자와 곱한 결과를 출력 (역순)
        for (int i = num2.length() - 1; i >= 0; i--) {
            int cut = Character.getNumericValue(num2.charAt(i));
            System.out.println(a * cut);
        }

        // 두 숫자의 곱 전체 결과 출력
        System.out.println(a * b);
    }
}
