<table border=5>
	<%@page import="java.util.List,com.myweb.entity.MyWebEntity" %>
<%
		
		List<MyWebEntity> ll=(List<MyWebEntity>)request.getAttribute("result");
		if(ll.size()>0){
		out.println(ll.size()+" Record Found");

		for(MyWebEntity mm:ll) { %>
				<tr><td>Name is</td><td><%= mm.getName() %></td></tr>
					<tr><td>Password is </td><td><%=mm.getPassword()%></td></tr>
					<tr><td>Email is</td><td><%=mm.getEmail()%></td></tr>
					<tr><td>Address is </td><td><%=mm.getAddress()%></td>
				</tr>
		<%	} 
	}

%>

			
		</table>