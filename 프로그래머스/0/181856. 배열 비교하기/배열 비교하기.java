class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr2.length > arr1.length) {
            return -1;
        }
        
        if (arr2.length < arr1.length) {
            return 1;
        }
        
        int arr1Sum = 0;
        int arr2Sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        
        if (arr1Sum == arr2Sum) {
            return 0;
        }
        
        return arr2Sum > arr1Sum ? -1 : 1;
    }
}
