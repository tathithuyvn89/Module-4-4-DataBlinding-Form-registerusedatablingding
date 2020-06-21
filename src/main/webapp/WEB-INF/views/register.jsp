<%--
  Created by IntelliJ IDEA.
  User: BKComputer
  Date: 6/18/2020
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<h1>${headerMessage}</h1>
<form:errors path="student.*"></form:errors>
<form:form action="/registerSuccess" method="post" commandName="student">
<h2 align="center">Student Registration Form</h2>
<table align="center">
    <tr>
        <td>Enter your Name</td>
        <td><form:input path="studentName"></form:input></td>
    </tr>
    <tr>
        <td>Enter your Gender</td>
        <td><form:radiobuttons path="gender" items="${genderList}"></form:radiobuttons> </td>
    </tr>
    <tr>
        <td>Select Hobies</td>
        <td>
            <form:select path="hobies" items="${hobyList}">
                <form:options items="${hobyList}"></form:options>
            </form:select>
        </td>
    </tr>
    <tr>
        <td>Select City</td>
        <td>
            <form:select path="city">
                <form:options items="${cityList}"></form:options>
            </form:select>
        </td>
    </tr>
    <tr>
        <td>Enter your Phone</td>
        <td><form:input path="phone"></form:input></td>
    </tr>
    tr>
    <td>Enter your Phone</td>
    <td><form:input path="birthday"></form:input>(mm/dd/yyyy)</td>
    </tr>
    <tr>
        <td><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>
</body>
</html>
