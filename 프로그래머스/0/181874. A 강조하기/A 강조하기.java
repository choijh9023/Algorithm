class Solution {
    public String solution(String myString) {
        // StringBuilder 객체를 생성하지 않고 myString을 먼저 소문자로 변환
        myString = myString.toLowerCase();

        // 새로운 StringBuilder 객체를 생성
        StringBuilder answer = new StringBuilder(myString);

        // 변환 작업 수행
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'a') {
                answer.setCharAt(i, Character.toUpperCase(c));
            }
        }

        // 결과 반환
        return answer.toString();
    }
}
