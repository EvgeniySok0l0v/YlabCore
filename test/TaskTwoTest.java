import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * class for test TaskTwo class
 */
public class TaskTwoTest {

    private final int target = 10;
    private final int invalidTargetForThisArray = 100;
    private final int[] array = new int[]{1, 4, 2, 0, -5, 2, 6, 8, 34, 2, 3};

    @Test
    public void twoSumTest(){
        int[] expected = new int[]{2,8};
        int[] actual = TaskTwo.twoSum(array,target);

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void twoSum2Test(){
        int[] expected = new int[]{4,6};
        int[] actual = TaskTwo.twoSum2(array,target);

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void twoSumInvalidTargetTest(){
        int[] expected = new int[0];
        int[] actual = TaskTwo.twoSum(array,invalidTargetForThisArray);

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void twoSum2InvalidTargetTest(){
        int[] expected = new int[0];
        int[] actual = TaskTwo.twoSum2(array,invalidTargetForThisArray);

        Assertions.assertArrayEquals(expected,actual);
    }
}
