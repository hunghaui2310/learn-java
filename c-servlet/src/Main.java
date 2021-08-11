import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Bat dau servlet");
    }

    @Override
    public void destroy() {
        System.out.println("Huy servlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        System.out.println("Phuong thuc cua Request: " + req.getMethod());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Xin chao Cac ban - Day la Servlet</h1>");
        writer.close();
    }
}
