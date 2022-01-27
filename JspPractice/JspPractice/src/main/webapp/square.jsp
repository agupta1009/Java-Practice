<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>square.jsp</title>
</head>
<body bgcolor="yellow">


<%


Cookie cookie[]=request.getCookies();
int add=0;
for(Cookie c:cookie){
	if(c.getName().equals("result"))
		add=Integer.parseInt(c.getValue());
}
int square=add*add;
out.println("Addition result is: "+add);
out.println("Square result is: "+square);



%>
</body>
</html>