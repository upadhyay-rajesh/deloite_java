<%@page import="com.facebookbootweb.entity.FacebookUser"%>
<%@page import="java.util.List"%>
<%

	List<FacebookUser> ll=(List<FacebookUser>)request.getAttribute("n1");

	for(FacebookUser f:ll){
		%>
		<%= f.getName()+" "+f.getPassword()+" "+f.getEmail()+" "+f.getAddress() %>
<%	}
%>