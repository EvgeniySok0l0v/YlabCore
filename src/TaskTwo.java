import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * class for task2
 */
public class TaskTwo {

    /**
     * Main method for demo how work task
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Result for twoSum - "
                + Arrays.toString(twoSum(new int[]{1, 4, 2, 0, -5, 2, 6, 8, 34, 2, 3}, 10)));
        System.out.println("Result for twoSum2 - "
                + Arrays.toString(twoSum2(new int[]{1, 4, 2, 0, -5, 2, 6, 8, 34, 2, 3}, 10)));

    }

    /**
     * method for find 2 numbers(a,b), where a+b=target
     * work with sorted array
     * @param array - int[]
     * @param target - target value
     * @return - int[]
     */
    public static int[] twoSum(int[] array, int target){
        Arrays.sort(array);
        int l = 0, r = array.length - 1;
        for (int i = 0; i < array.length; i++){
            int targetNumber = array[l] + array[r];
            if(targetNumber == target){
                return new int[]{array[l], array[r]};
            } else {
                if(targetNumber < target){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new int[0];
    }
    /**
     * method for find 2 numbers(a,b), where a+b=target
     * work with all arrays
     * @param array - int[]
     * @param target - target value
     * @return - int[]
     */
    public static int[] twoSum2(int[] array, int target){
        Set<Integer> rememberValues = new HashSet<>();
        for (int j : array) {
            int numberToFind = target - j;
            if (rememberValues.contains(numberToFind)) {
                return new int[]{numberToFind, j};
            }
            rememberValues.add(j);
        }
        return new int[0];
    }
}
