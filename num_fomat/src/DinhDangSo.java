import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {

    public static void main(String[] args) {

        long l = 1243567;
        double k = 1234124.432523;

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getInstance(locale);

        format.setMaximumFractionDigits(4);
        format.setMinimumFractionDigits(0);

        format.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println(format.format(l));
        System.out.println(format.format(k));

        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println(decimalFormat.format(l));
        System.out.println(decimalFormat.format(k));

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator('-');
        decimalFormatSymbols.setDecimalSeparator(',');

        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        System.out.println(decimalFormat.format(l));
        System.out.println(decimalFormat.format(k));
    }
}
