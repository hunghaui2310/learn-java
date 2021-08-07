import java.util.Objects;

public class Person {

    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person) && (((Person) o).getId() == this.getId());
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
