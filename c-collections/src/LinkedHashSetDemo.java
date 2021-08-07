import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<Person> people = new LinkedHashSet<>();

        people.add(new Person(1));
        people.add(new Person(5));
        people.add(new Person(2));
        people.add(new Person(7));

        people.remove(new Person(5));
        System.out.println("Sau khi xoa = ");
        for (Person person : people) {
            System.out.println(person.getId());
        }
    }
}
