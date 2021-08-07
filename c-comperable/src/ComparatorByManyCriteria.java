import java.util.ArrayList;
import java.util.List;

public class ComparatorByManyCriteria {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "A", 13));
        people.add(new Person(3, "N", 22));
        people.add(new Person(19, "A", 75));
        people.add(new Person(12, "A",12));
        people.add(new Person(2, "W", 23));
        people.add(new Person(7, "R", 55));

        System.out.println("Sau khi sap xep = ");

        people.sort((p1, p2) -> {
            if (p1.getName().compareTo(p2.getName()) > 0) {
                return 1;
            } else if (p1.getName().compareTo(p2.getName()) < 0) {
                return -1;
            } else {
                return Integer.compare(p1.getDiem(), p2.getDiem());
            }
        });

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getDiem());
        }
    }

}
