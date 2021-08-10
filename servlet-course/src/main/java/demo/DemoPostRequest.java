package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form"})
public class DemoPostRequest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<form action='/servlet-course/save' method='post'>");
		printWriter.print("Ten: <input type='text' name='ten'>");
		printWriter.print("Tuoi: <input type='number' name='tuoi'>");
		printWriter.print("<input type='submit' value='submit'>");
		printWriter.print("</form>");
	}
}
