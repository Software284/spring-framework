<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Company Home Page</h2>
	<hr>
		<p>
			User: <security:authentication property="principal.username"/>
			<br><br>
			Role(s): <security:authentication property="principal.authorities"/>
		</p>
		<hr>
		<security:authorize access="hasRole('MANAGER')">
			<a href="${pageContext.request.contextPath}/leaders">LeadeShip Meeting</a>
			(Only for Manager peeps).
		<hr>
		</security:authorize>
		
		<security:authorize access="hasRole('ADMIN')">
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			(Only for Admin peeps)
		<hr>
		</security:authorize>
		
		
	<p>
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Logout"/>
		</form:form>
	</p>
</body>
</html>