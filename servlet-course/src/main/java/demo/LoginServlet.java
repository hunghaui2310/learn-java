package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<form action='/servlet-course/login' method='post'>");
		printWriter.print("Username: <input type='text' name='username'>");
		printWriter.print("Username: <input type='text' name='password'>");
		printWriter.print("<input type='submit' value='Login'>");
		printWriter.print("</form>");
		printWriter.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equals("hungnn") && password.equals("123456")) {
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/servlet-course/xin-chao");
		} else {
			resp.sendRedirect("/servlet-course/login");
		}
	}

}
