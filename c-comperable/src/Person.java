public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int diem;

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, int diem) {
        super();
        this.id = id;
        this.name = name;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.getId());
    }
}
