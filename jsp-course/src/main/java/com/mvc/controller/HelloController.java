package com.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.User;

@WebServlet(urlPatterns = {"/hello", "/xin-chao"})
public class HelloController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("HungNN");
		user.setAddress("Hai Ba Trung, Ha Noi");
		req.setAttribute("mvc", "Test MVC Design Pattern");
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("hello.jsp");
		requestDispatcher.forward(req, resp);
	}
}
