import java.util.*;
import java.util.stream.Collectors;

/**
 * Class for task1
 */
public class TaskOne {

    /**
     * record
     * @param id - id of Person
     * @param name - name of Person
     */
    record Person(int id, String name) {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return id() == person.id() && name().equals(person.name());
        }

        @Override
        public int hashCode() {
            return Objects.hash(id(), name());
        }
    }

    /**
     * RAW_DATA
     */
    private static final Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    /**
     * Main method for demo how work task
     * @param args - args
     */
    public static void main(String[] args) {
        Map<Object, List<Person>> people = getPeople(RAW_DATA);

        people.forEach((key, value) -> {
            System.out.println(key + ":");
            for (int i = 0; i < value.size(); i++) {
                System.out.println(i+1 + " - " + value.get(i).name + " (" +  value.get(i).id + ")");
            }
        });
    }

    /**
     * Method for remove duplicate,
     *            sort collection by key value and id insert collection
     *            group by name(key)
     * @param people - array of Person
     * @return - Map<Object,List<Person></>></>
     */
    public static Map<Object, List<Person>> getPeople(Person[] people){
        return Arrays.stream(people)
                .distinct()
                .sorted(Comparator.comparingInt(p -> p.id))
                .collect(Collectors.groupingBy(p -> p.name));
    }
}
