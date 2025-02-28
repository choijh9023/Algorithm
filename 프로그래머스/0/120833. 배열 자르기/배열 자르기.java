import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = Arrays.stream(numbers)
                                    .boxed()
                                     .collect(Collectors.toList());
                                     
        
        return list.subList(num1, num2+1)
                    .stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}