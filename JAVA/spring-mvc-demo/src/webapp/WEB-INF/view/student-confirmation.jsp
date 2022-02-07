<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
Student Confirmation
</head>
    <body>
    The Student is confirmed : ${student.firstName} ${student.lastName}
    <br> <br>
    The Student is from: ${student.country}
     <br> <br>
        Favorite Language is : ${student.favoriteLanguage}
      <br> <br>
        Knows operating Systems:
              <ul>
              <c:forEach var="temp" items="${student.operatingSystems}">
              <li>${temp}</li>
              </c:forEach>
              </ul>
    </body>
</html>