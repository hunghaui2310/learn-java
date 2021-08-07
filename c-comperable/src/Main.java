import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "A"));
        people.add(new Person(5, "D"));
        people.add(new Person(8, "G"));
        people.add(new Person(2, "N"));
        people.add(new Person(12, "M"));

        System.out.println("People sau khi sap xep");

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getId());
        }
    }
}
