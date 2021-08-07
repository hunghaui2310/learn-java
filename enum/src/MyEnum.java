public enum MyEnum {

    COCA("coca"),TEA("tea"),CAFE("cafe");
    private String ten;

    private MyEnum(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
