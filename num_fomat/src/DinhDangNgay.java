import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DinhDangNgay {

    public static void main(String[] args) {

        String pattern = "dd/MM/yyyy";
        String pattern2 = "dd-MM-yyyy hh:mm a";
        String pattern3 = "EEEEE, MMMMM yyyy hh:mm a";

        Locale locale = new Locale("vi", "VN");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern3, locale);

        System.out.println(simpleDateFormat.format(new Date()));
    }
}
