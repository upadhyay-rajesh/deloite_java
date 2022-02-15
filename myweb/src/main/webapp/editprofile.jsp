<!DOCTYPE html>
<%@page import="com.myweb.entity.MyWebEntity"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<%
MyWebEntity mm=(MyWebEntity)request.getAttribute("result");

%>

  <center>
	<p><font color=red size=5>Edit Page</font></p>
	<form action="EditServlet1" method="post">
	<table border="6">
		<tr>
			<td>Name</td><td><input type=text id="n1" name=nm required value=<%=mm.getName() %>></td>
		</tr>
		<tr>
			<td>Password</td><td><input type=password name=pass maxlength=8 minlength=3 value=<%=mm.getPassword() %>></td>
		</tr>
		<tr>
			<td>Email</td><td><input type=email name=em value=<%=mm.getEmail() %>  disabled></td>
		</tr>
		<tr>
			<td>Address</td><td><input type=text name=ad value=<%=mm.getAddress() %>></td>
		</tr>
		<tr>
			<td><input type=submit value=Edit  ></td><td><input type=reset></td>
		</tr>
	</table>
	</form>
	
	<div id="a"></div>
	<br>
	
	
	</center>
</body>
</html>