package com.ddn;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class calC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		int x = Integer.parseInt(req.getParameter("n1"));
		int y = Integer.parseInt(req.getParameter("n2"));
		int z = x*y+y;
		System.out.println(z);
	}

}
