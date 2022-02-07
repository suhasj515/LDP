<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
Student form
</head>
    <body>
    <form:form action="processForm" modelAttribute="student">
    Fist name: <form:input path="firstName" />
    <br> <br>
    Last name: <form:input path="lastName" />
    <br> <br>
    <form:select path="Country">
        <form:options items="${student.countryOptions}" />
    </form:select>
     <br> <br>
         Favorite Language:
             Java <form:radiobutton path="favoriteLanguage" value="Java" />
             Python <form:radiobutton path="favoriteLanguage" value="Python" />
             C# <form:radiobutton path="favoriteLanguage" value="C#" />
     <br> <br>
     Operating Systems:
        Linux<form:checkbox path="operatingSystems" value="Linux" />
        Windows<form:checkbox path="operatingSystems" value="Windows" />
        Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
     <br> <br>
        <input type="submit" value="Submit" />

    </form:form>
    </body>
</html>