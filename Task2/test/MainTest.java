import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Class for test Main class
 */
public class MainTest {

    @Test
    public void sortArrayTest(){
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
        int[] actualArray = Main.sortArray(new int[]{5,6,3,2,5,1,4,9});
        Assertions.assertArrayEquals(expectedArray,actualArray);
    }
}
