<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Custom Login page</title>
    <style>
        .failed{
            color: red;
        }
    </style>
</head>
<body>
<h3>Custom login page</h3>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">

    <!-- check for login error -->
    <c:if test="${param.error !=null}">
        <i class="failed">Sorry wrong user name or password!</i>
    </c:if>


    <p>User name: <input type="text" name="username"></p>
    <p>User name: <input type="password" name="password"></p>
    <input type="submit" value="Login" />
</form:form>
</body>
</html>
