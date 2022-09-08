import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * class for test TaskOne class
 */
public class TaskOneTest {

    private final TaskOne.Person[] RAW_DATA = new TaskOne.Person[]{
        new TaskOne.Person(0, "Harry"),
                new TaskOne.Person(0, "Harry"), // дубликат
                new TaskOne.Person(1, "Harry"), // тёзка
                new TaskOne.Person(2, "Harry"),
                new TaskOne.Person(3, "Emily"),
                new TaskOne.Person(4, "Jack"),
                new TaskOne.Person(4, "Jack"),
                new TaskOne.Person(5, "Amelia"),
                new TaskOne.Person(5, "Amelia"),
                new TaskOne.Person(6, "Amelia"),
                new TaskOne.Person(7, "Amelia"),
                new TaskOne.Person(8, "Amelia"),
                new TaskOne.Person(9,null),
    };

    @Test
    public void getPeopleTest() {
        Map<Object, List<TaskOne.Person>> expectedData = new HashMap<>(
                Map.of("Amelia", List.of(
                                new TaskOne.Person(5, "Amelia"),
                                new TaskOne.Person(6, "Amelia"),
                                new TaskOne.Person(7, "Amelia"),
                                new TaskOne.Person(8, "Amelia")),
                        "Emily", List.of(
                                new TaskOne.Person(3, "Emily")
                        ),
                        "Harry", List.of(
                                new TaskOne.Person(0, "Harry"),
                                new TaskOne.Person(1, "Harry"),
                                new TaskOne.Person(2, "Harry")
                        ),
                        "Jack", List.of(
                                new TaskOne.Person(4, "Jack")
                        )));

        Map<Object, List<TaskOne.Person>> actualData = TaskOne.getPeople(RAW_DATA);

        Assertions.assertEquals(expectedData,actualData);
    }
}
