class Solution {
    public int solution(String my_string, String is_suffix) {
         int answer = 0;
        for(int i = 0; i <my_string.length(); i ++){ 
            StringBuilder sb = new StringBuilder();
            for(int j =i ;j<my_string.length();j ++ ){
                sb.append(my_string.charAt(j));
            }
            if(sb.toString().equals(is_suffix)){
               answer = 1;
            }
           
        }
        
       
        return answer;
    }
}