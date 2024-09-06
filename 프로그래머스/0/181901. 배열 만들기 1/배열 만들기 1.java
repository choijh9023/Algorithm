class Solution {
    public int[] solution(int n, int k) {
        int a = n/k;
        int count= 1;
         int[] answer = new int[a]; 
        for(int i = 0; i < answer.length ; i++){
            answer[i]=k*count;
            count++;
            
        }
       
        return answer;
    }
}