import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * class for test TaskThree class
 */
public class TaskThreeTest {

    @Test
    public void fuzzySearchTest1(){
        String target = "car";
        String str = "ca6$$#_rtwheel";
        boolean expected = true;
        boolean actual = TaskThree.fuzzySearch(target, str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fuzzySearchTest2(){
        String target = "cwhl";
        String str = "cartwheel";
        boolean expected = true;
        boolean actual = TaskThree.fuzzySearch(target, str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fuzzySearchTest3(){
        String target = "cwheeel";
        String str = "cartwheel";
        boolean expected = false;
        boolean actual = TaskThree.fuzzySearch(target, str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fuzzySearchTest4(){
        String target = "car";
        String str = "ca";
        boolean expected = false;
        boolean actual = TaskThree.fuzzySearch(target, str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fuzzySearchTest5(){
        String target = "0car";
        String str = "0ca6$$#_rtwheel";
        boolean expected = true;
        boolean actual = TaskThree.fuzzySearch(target, str);

        Assertions.assertEquals(expected, actual);
    }
}
