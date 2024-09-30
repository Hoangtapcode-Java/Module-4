<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-22
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Form Login</h2>
    <form:form action="/login/show" method="post" modelAttribute="login">
        <fieldset>
            <legend>Login</legend>
            <table>
                <tr>
                    <td><form:label path="account">Account:</form:label></td>
                    <td><form:input path="account"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password:</form:label></td>
                    <td><form:input path="password"></form:input></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
