<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	function validate(){
		console.log("hello");
		v1=document.getElementById("n1").value;
		
		document.getElementById("a").innerHTML=v1;
	}
	

</script>


</head>
<body>
  <center>
	<p><font color=red size=5>Registration Page</font></p>
	<form action="RegistrationServlet" method="post">
	<table border="6">
		<tr>
			<td>Name</td><td><input type=text id="n1" name=nm required  onkeyup="validate()"></td>
		</tr>
		<tr>
			<td>Password</td><td><input type=password name=pass maxlength=8 minlength=3></td>
		</tr>
		<tr>
			<td>Email</td><td><input type=email name=em></td>
		</tr>
		<tr>
			<td>Address</td><td><input type=text name=ad></td>
		</tr>
		<tr>
			<td><input type=submit value=SignUp  ></td><td><input type=reset></td>
		</tr>
	</table>
	</form>
	
	<div id="a"></div>
	<br>
	<%= request.getAttribute("result") %>
	
	</center>
</body>
</html>