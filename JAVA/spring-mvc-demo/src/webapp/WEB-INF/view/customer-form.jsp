<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <title>Customer Registration Form </title>
    <style>
        .error {color:red}
    </style>
    <body>
        <form:form action="processForm" modelAttribute="customer">

            First Name: <form:input path="firstName" />
            <br><br>
            Last Name (*): <form:input path="lastName"/>
                <form:errors path="lastName" cssClass="error" />
            <br><br>
            Free passes: <form:input path="freePasses"/>
                            <form:errors path="freePasses" cssClass="error" />

            <br><br>
                        Postal Code: <form:input path="postalCode"/>
                                   <form:errors path="postalCode" cssClass="error" />
            <br><br>
            <br><br>
                                    Course Code: <form:input path="courseCode"/>
                                               <form:errors path="courseCode" cssClass="error" />
            <br><br>
                        <input type="Submit" value="Submit" />
            </form:form>
    </body>
</html>