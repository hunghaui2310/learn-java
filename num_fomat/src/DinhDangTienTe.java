import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangTienTe {

    public static void main(String[] args) {

        long l = 12345987;

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        System.out.println(format.format(l));

        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator('-');
        decimalFormatSymbols.setCurrencySymbol("vnd");

        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        System.out.println(decimalFormat.format(l));
    }
}
