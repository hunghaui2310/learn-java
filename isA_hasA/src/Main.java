import dto.DiaChi;
import dto.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setTen("A");
        employee.setDiaChi(null);

        DiaChi diaChi = new DiaChi();
        diaChi.setTenDuong("Ha Noi");
        employee.setDiaChi(diaChi);

        System.out.println(employee.getTen());
        System.out.println(employee.getDiaChi().getTenDuong());
    }
}
