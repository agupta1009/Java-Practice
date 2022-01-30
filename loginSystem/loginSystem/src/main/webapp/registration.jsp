<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>


</head>
<body>
<form action="login.jsp">
Already a User <input type="submit" value="Login"> <br>
</form>


<form action="registrationServlet" method="get">
<br> Enter email <input type="email" placeholder="@domain.com" name="email">
<br> Enter username <input type="text" placeholder="username" name="username">
<br> Enter password <input type="password" placeholder="password" name="password">
<br> Submit <input type="submit" value="Submit"> 
</form>




<%@ include file="footer.jsp" %>
</body>
</html>