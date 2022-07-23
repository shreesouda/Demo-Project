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

public class SqServer extends HttpServlet {
	
public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
	
		int sq = 0;
		//int a = Integer.parseInt(req.getParameter("num1"));
		//int b = Integer.parseInt(req.getParameter("num2"));
		//int c = a * b;
		
		//Request Dispatcher
		//int sq = Integer.parseInt(req.getAttribute("c"));
		
		//URL Rewriting
		//int sq = Integer.parseInt(req.getParameter("n"));
		
		//Session
		/*HttpSession hs = req.getSession();
		int sq = (int)hs.getAttribute("name");*/
		
		//cookie
		Cookie cook[] = req.getCookies();
		for (Cookie coo : cook) {
			if (coo.getName().equals("name"))
				sq = Integer.parseInt(coo.getValue());
		}
		
		sq = sq * sq;
		PrintWriter pt = res.getWriter();
		pt.println("Square of the sum using cookie : " + sq);
		
	}

}
