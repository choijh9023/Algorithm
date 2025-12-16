import java.io.IOException;
import java.io.InputStreamReader;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0 ; i < queries.length; i ++){
           int a = queries[i][0];
           int b = queries[i][1];
           int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
            
            
        }
        
      
        return arr;
    }
}