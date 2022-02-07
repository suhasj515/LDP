<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	<title>Home page</title>
</head>

<body>
	<h2>Welcome</h2>
	<hr>
	
	Welcome to the home page
	<form:form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="submit" value="Log Out">
	</form:form>

</body>

</html>