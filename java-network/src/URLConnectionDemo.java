import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

    public static void main(String[] args) {

//        URLConnectionCourse();
        HttpURLConnectionCourse();
    }

    static void URLConnectionCourse() {
        try {
            URL url = new URL("https://www.facebook.com/");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            int i = inputStream.read();
            while (i != -1) {
                System.out.println((char) i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void HttpURLConnectionCourse() {
        try {
            URL url = new URL("https://www.facebook.com/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (int i = 0; i < httpURLConnection.getHeaderFields().size(); i++) {
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + "=" + httpURLConnection.getHeaderField(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
