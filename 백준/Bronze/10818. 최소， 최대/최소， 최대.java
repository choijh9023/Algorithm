// 자바 입출력 및 문자열 처리를 위한 라이브러리들을 불러옵니다.
import java.io.BufferedReader; // 많은 양의 입력을 효율적으로 처리하기 위해 사용
import java.io.IOException; // 입출력 과정에서 발생할 수 있는 예외를 처리하기 위해 필요
import java.io.InputStreamReader; // System.in (바이트 스트림)을 문자 스트림으로 변환
import java.util.Arrays;
import java.util.StringTokenizer; // 문자열을 특정 구분자(기본값: 공백)로 나누기 위해 사용

// 25년 9월 8일
// 정수를 입력 받아 최소값, 최대값을 구하는 문제
public class Main {
//    // 람다식으로 리펙토링하여 풀 수 있는 방법
//    // 키보드 입력을 받기 위한 BufferedReader 객체를 생성합니다.
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    // 첫 번째 줄(숫자의 개수)은 스트림 방식에서 필요 없으므로 읽기만 하고 사용하지 않습니다.
//        br.readLine();
//
//    // 두 번째 줄을 읽어 공백으로 나눈 후 문자열 배열로 만듭니다.
//    String[] numStrs = br.readLine().split(" ");
//
//    // 스트림을 사용해 최솟값 찾기
//    int min = Arrays.stream(numStrs)
//            .mapToInt(Integer::parseInt) // 각 문자열을 정수로 변환
//            .min() // 스트림에서 최솟값을 OptionalInt 형태로 찾음
//            .getAsInt(); // OptionalInt에서 실제 int 값을 꺼냄
//
//    // 스트림을 사용해 최댓값 찾기
//    int max = Arrays.stream(numStrs)
//            .mapToInt(Integer::parseInt)
//            .max()
//            .getAsInt();
//
//    // 최종적으로 찾은 최솟값과 최댓값을 출력합니다.
//        System.out.println(min + " " + max);

    // 프로그램의 시작점인 메인 메소드입니다. throws IOException은 입출력 예외를 처리합니다.
    public static void main(String[] args) throws IOException {

        // 키보드 입력을 받기 위한 BufferedReader 객체를 생성합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        // 첫 번째 줄에서 입력받은 문자열(숫자의 개수)을 정수형으로 변환하여 변수 'a'에 저장합니다.
        int a = Integer.parseInt(br.readLine());

        // 'a'개의 정수를 저장할 수 있는 배열 'intarray'를 생성합니다.
        int [] intarray = new int[a];

        // 두 번째 줄을 통째로 읽어와서 공백을 기준으로 나눌 StringTokenizer 객체를 생성합니다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        // StringTokenizer에서 첫 번째 숫자(토큰)를 가져와 정수로 변환 후 배열의 0번 인덱스에 저장합니다.
        intarray[0] = Integer.parseInt(st.nextToken());

        // 최솟값을 저장할 변수 'min'을 배열의 첫 번째 값으로 우선 초기화합니다.
        int min = intarray[0];
        // 최댓값을 저장할 변수 'max'를 배열의 첫 번째 값으로 우선 초기화합니다.
        int max = intarray[0];

        // 두 번째 숫자부터 마지막 숫자까지 비교하기 위해 반복문을 실행합니다. (i=0은 이미 처리했으므로 i=1부터 시작)
        for (int i = 1; i < a; i++) {

            // 다음 토큰(숫자)을 가져와 정수로 변환 후 배열의 현재 인덱스(i)에 저장합니다.
            intarray[i] = Integer.parseInt(st.nextToken());

            // 만약 현재 배열의 값이 기존의 최솟값(min)보다 작으면,
            if(intarray[i] < min){
                // 최솟값을 현재 값으로 교체(업데이트)합니다.
                min = intarray[i];
            }

            // 만약 현재 배열의 값이 기존의 최댓값(max)보다 크면,
            if(intarray[i] > max){
                // 최댓값을 현재 값으로 교체(업데이트)합니다.
                max = intarray[i];
            }
        }
        // 반복문이 끝난 후, 최종적으로 찾은 최솟값과 최댓값을 공백으로 구분하여 출력합니다.
        System.out.print(min + " " + max);


    }
}