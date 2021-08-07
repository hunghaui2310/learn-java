import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparator {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "A"));
        people.add(new Person(3, "N"));
        people.add(new Person(19, "T"));
        people.add(new Person(12, "J"));
        people.add(new Person(2, "W"));
        people.add(new Person(7, "R"));

        System.out.println("Sau khi sap xep = ");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.compare(person.getId(), t1.getId());
            }
        });
        for (Person person : people) {
            System.out.println(person.getId());
        }
    }
}
