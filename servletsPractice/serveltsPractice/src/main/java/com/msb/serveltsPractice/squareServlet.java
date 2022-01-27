package com.msb.serveltsPractice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squareServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int result_of_add=(int)req.getAttribute("add");
		int square=result_of_add*result_of_add;
		resp.getWriter().println("Result of addition is: "+result_of_add);
		resp.getWriter().println("Result of square is: "+square);
		resp.getWriter().print("i am in get method");
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int result_of_add=(int)req.getAttribute("add");
		int square=result_of_add*result_of_add;
		resp.getWriter().println("Result of addition is: "+result_of_add);
		resp.getWriter().println("Result of square is: "+square);
		resp.getWriter().print("i am in post method");

		
	}

}
