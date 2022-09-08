import java.util.Arrays;

/**
 * Man class for task2
 */
public class Main {

    public static void main(String[] args) {
        sortArray(new int[]{5,6,3,2,5,1,4,9});
    }

    /**
     * Method for sort array
     * @param array - for sort
     * @return sorted array
     */
    public static int[] sortArray(int[] array){
        System.out.println(Arrays.toString(array));
        int gap = array.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
        return array.clone();
    }

    /**
     * Method for swap elements of array
     * @param array - array
     * @param ind1 - index 1
     * @param ind2 - index 2
     */
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
