package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test-cookie")
public class ServletCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("This is content of Test Cookie");
		
		Cookie cookie = new Cookie("name", "Test Cookie");
		cookie.setMaxAge(5);
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("age", "21");
		cookie2.setMaxAge(10);
		resp.addCookie(cookie2);
		printWriter.close();
	}
}
