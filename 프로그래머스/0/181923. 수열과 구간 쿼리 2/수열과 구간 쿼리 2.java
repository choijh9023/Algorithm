class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 결과 배열 크기는 쿼리 개수만큼

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }

            // min이 갱신되지 않았다면 -1
            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }

        return answer;
    }
}
