<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="exception.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	
	<div class="form-centre">
		<form action="loginServlet" method="post">
			Enter Name: <input type="text" name="name" placeholder="name" ><br> 
			Enter Password: <input type="password" name="password" placeholder="password"><br>
			Submit: <input type="submit" value="Submit">
		</form>
	</div>


	<%@ include file="footer.jsp"%>



</body>
</html>