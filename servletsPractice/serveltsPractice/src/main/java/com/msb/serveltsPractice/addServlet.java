package com.msb.serveltsPractice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {
//	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException
//	{
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		resp.getWriter().println("the answer is: "+ (i+j));
//		
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		req.setAttribute("add", (i+j));
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		req.setAttribute("add", (i+j));
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, resp);
		
	}
	

}
