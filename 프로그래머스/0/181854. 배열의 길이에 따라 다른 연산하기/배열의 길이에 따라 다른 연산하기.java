class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
       for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
     for(int i = 0 ; i <arr.length; i ++){
         if(arr.length%2==1){
             if(i%2==0){
                 answer[i]+=n;
             }
         }else{
             if(i%2==1){
                 answer[i]+=n;
                  }
              }
         }
     
        
        return answer;
    }
}