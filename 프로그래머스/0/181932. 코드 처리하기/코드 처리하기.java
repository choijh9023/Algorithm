class Solution {
    public String solution(String code) {
        
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for(int idx = 0; idx<code.length(); idx ++){
          char current = code.charAt(idx);
            
              if(current =='1'){
                  mode = (mode ==0) ? 1 :0;
              }
            else{
                if(mode ==0 && idx %2 ==0){
                    answer.append(current);
                }else if(mode ==1 && idx %2 !=0){
                    answer.append(current);
                }
            }
        }
        if(answer.length()==0){
            return "EMPTY";
        }else{return answer.toString();}
        
    }
}