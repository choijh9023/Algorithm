class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int a = 0 ; a < my_string.length(); a ++){
            
            for(int b = 1; b<=n; b ++){
                sb.append(my_string.charAt(a));
            }
            
            
        }
        return sb.toString();
    }
}