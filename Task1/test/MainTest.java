import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Class for test Task1
 */
public class MainTest {

    private final Main task1 = new Main(new int[][]{
            {1,3,0},
            {-3,43,5},
            {0,0,-2}});
    @Test
    public void test1(){
        String expectedString = "Max value: " + 43
                + "\nMin value: " + -3
                + "\nAverage value: " + 5.222222222222222;
        task1.getValuesForTask1();
        Assertions.assertEquals(expectedString,task1.toString());
    }
}