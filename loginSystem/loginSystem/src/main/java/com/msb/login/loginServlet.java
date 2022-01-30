package com.msb.login;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name=request.getParameter("name").toString();
		String password=request.getParameter("password").toString();
		System.out.println(name+"  "+password);
		loginDao Dao=new loginDao();
		boolean check=false;;
		try {
			check = Dao.check(name, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		if(check)
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", name);
			session.setAttribute("password", password);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
	
		
		
	}
		
}
