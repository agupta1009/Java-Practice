<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secured Content</title>
</head>
<body>
<%
//used to stop the page from caching in web browser
response.setHeader("cache-control", "no-cache, no-store, must revalidate" );

if((session.getAttribute("username")==null)||(session.getAttribute("password")==null))
{
	response.sendRedirect("login.jsp");
}

%>

Hi, This is content page<br>
<h1>Secured Page</h1>



<form action="logout">
<input type="submit" value="lOGOUT">
</form>
</body>

    <%@ include file="footer.jsp" %>

</html>