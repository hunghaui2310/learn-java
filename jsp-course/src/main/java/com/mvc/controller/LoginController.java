package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login1")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		String user = req.getParameter("user");
		if (user.equals("HungNN")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
			requestDispatcher.forward(req, resp);
		} else {
			printWriter.print("User Khong chinh xac");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/form-login");
			requestDispatcher.forward(req, resp);
		}
	}
}
