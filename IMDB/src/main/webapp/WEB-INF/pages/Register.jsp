<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SignUp" method="post">
	<table style="background-color:skyblue; margin-left:20px;margin-left:20px;">
	<tr>
	<td><h3 style="color:Black;">Register </h3></td>
	<td></td>
	</tr>
	<tr>
		<td>UserName:</td>
		<td><input type="text" name="username"></td>
		<div style="color:red">${Emessage}</div>
	</tr>
	
	<tr>
		<td>Email:</td>
		<td><input type="email" name="email"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password1"></td>
	</tr>
	<tr>
		<td>Re-Type Password:</td>
		<td><input type="password" name="password2"></td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" value="SignUp"></td>
		<td></td>
	</tr>
	
	</table>
	
	</form>
</body>
</html>