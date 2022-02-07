<%--
  Created by IntelliJ IDEA.
  User: suhasj
  Date: 20/01/22
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Spring rest Demo
<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
<br>
<hr>
<a href="${pageContext.request.contextPath}/api/students">GET all Students</a>
</body>
</html>
