class Solution {
    public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        char alpChar = a.charAt(0);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (Character.toLowerCase(currentChar) == Character.toLowerCase(alpChar)) {
                answer.append(Character.toUpperCase(currentChar));
            } else {
                answer.append(currentChar);
            }
        }

        return answer.toString();
    }
}