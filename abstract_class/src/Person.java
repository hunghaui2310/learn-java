public abstract class Person {

    private String ten;

    public abstract double luong();

    public Person() {
    }

    public Person(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
