<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Login.css" type="text/css" media="all" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="LoginServlet" method="post">
  <table style="background-color:skyblue; margin-left:20px;margin-left:20px;">	
	<tr>
	<td><h3 style="color:Black;">Login </h3></td>
	<td></td>
	</tr>
	<tr>
		<td>UserName:</td>
		<td><input type="text" name="uname"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="pass"></td>
	</tr>
</table>

		   <button type="submit" class="float">Login</button>
		   <br></br>
		   <a href="Register.jsp">Register</a>



 </form>

</body>
</html>