class Solution {
    public int[] solution(int[] num_list) {
       int [] answer = new int[num_list.length+1]; // num_list 길이가 5면 answer 인덱스 길이는 6이다. 
        
      
        for(int i = 0; i <num_list.length; i ++){
            answer[i] = num_list[i];
        };
        int last = num_list[num_list.length -1];
        int secondlast = num_list[num_list.length-2];
        if(last>secondlast){
            answer[num_list.length] = last-secondlast;
        }else{
            answer[num_list.length] = last*2;
        }
        return answer;
    }
}