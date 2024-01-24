import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    private static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> number2Index = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int sub = target - array[i];
            if (number2Index.containsKey(sub)) {
                return new int[]{number2Index.get(sub), i};
            }
            number2Index.put(array[i], i);
        }
        return new int[0];
    }
}
