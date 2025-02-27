class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        
        // 배열의 합 구하기
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // 평균 계산 (double로 변환)
        return (double) sum / numbers.length;
    }
}
