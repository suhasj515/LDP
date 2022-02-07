<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>

<head>
	<title>Home page</title>
</head>

<body>
	<h2>Welcome</h2>
	<hr>
	
	Welcome to the home page
	<hr>
	<!-- display user name -->
	User : <security:authentication property="principal.username" />
	<br/>
	User roles : <security:authentication property="principal.authorities" />
	<hr>
	<security:authorize access="hasRole('MANAGER')">
	<!-- add link to point to managers page -->
	<p>
		<a href="${pageContext.request.contextPath}/leaders">Leadership meeting(Only managers)</a>
	</p>
	</security:authorize>
	<hr>
	<security:authorize access="hasRole('ADMIN')">
	<!-- add link to point to admin page -->
	<p>
		<a href="${pageContext.request.contextPath}/systems">Admin meeting(Only for administrators)</a>
	</p>
	<hr>
	</security:authorize>
	<form:form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="submit" value="Log Out">
	</form:form>

</body>

</html>