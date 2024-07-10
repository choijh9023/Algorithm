class Solution {
    public int solution(int[] arr1, int[] arr2) {
       int answer = 0;
      if(arr2.length>arr1.length){
          answer = -1;
      }
        
        
         if(arr2.length<arr1.length){
          answer = 1;
      }
        int arr1Sum = 0;
        int arr2Sum = 0;
        
        
        if(arr1.length==arr2.length){
            for(int i = 0; i<arr1.length; i++){
                arr1Sum+=arr1[i];
                arr2Sum+=arr2[i];        
            }
            if(arr1Sum==arr2Sum){
                answer = 0 ;
            }else if(arr2Sum>arr1Sum){
                answer = -1; 
            }else{
                answer = 1;
            }
         
        }
       
        return answer;
    }
}