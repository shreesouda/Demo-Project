package com.shree;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SumServlet extends HttpServlet {
	
	//interaction between servlets.
	
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int a = Integer.valueOf(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a + b;
		
		//Request Dispatcher
		/*req.setAttribute("c", c);
		RequestDispatcher rd = req.getRequestDispatcher("spserver");
		rd.forward(req, res);*/
		
		//Redirect
		//URL Rewriting
		//res.sendRedirect("sqserver?n="+c);
		
		//Session
		/*HttpSession hs = req.getSession();
		hs.setAttribute("name", c);
		res.sendRedirect("sqserver");*/
		
		//Cookie
		Cookie cook = new Cookie("name", c + "");
		res.addCookie(cook);
		res.sendRedirect("sqserver");
		
		/*PrintWriter pt = res.getWriter();
		pt.println(c);
		System.out.println(c);*/
		
	}
}
