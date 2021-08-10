package demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("Called to init Servlet");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("Called to destroy Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.print("Method of request" + req.getMethod());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String name = "";
		HttpSession httpSession = req.getSession();
		Object obj = httpSession.getAttribute("name");
		if (obj != null) {
			name = String.valueOf(obj);
			printWriter.print("<h1>Day la Java Servlet co chua session</h1>" + name);
		} else {
			printWriter.print("<h1>Day la Java Servlet</h1>");
		}
		String nameOfSContext = (String) getServletContext().getAttribute("name");
		printWriter.print("Name Context = " + nameOfSContext);
		printWriter.close();
	}
}