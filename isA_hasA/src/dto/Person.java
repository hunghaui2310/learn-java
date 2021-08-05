package dto;

public class Person {

    private String ten;
    private DiaChi diaChi; // Has A: Moi Person has a DiaChi

    public Person(String ten) {
        super();
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
}
