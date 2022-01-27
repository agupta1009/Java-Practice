<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add.jsp</title>
</head>
<body>
<%
	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2"));
	
	//RequestDispatcher rd=request.getRequestDispatcher("square.jsp");
	//rd.forward(request,response);
	Cookie cookie1=new Cookie("num1",i+"");
	Cookie cookie2=new Cookie("num2",j+"");
	Cookie cookie3=new Cookie("result",(i+j)+"");
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);
	System.out.println("i'm in add.jsp");
	System.out.println("num1: "+i);
	System.out.println("num2:"+j);

	response.sendRedirect("square.jsp");


%>
</body>
</html>