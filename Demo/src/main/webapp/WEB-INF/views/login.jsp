<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${status }
	<h2>Login Credentials</h2>
	<form action="login" method="post">
	Enter Email :  <input type="text" name="email"> <br/>
	Enter Password : <input type="password" name="password"><br/>
	<input type="submit" value="LOGIN">
	
	</form>
</body>
</html>