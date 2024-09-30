<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-22
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Welcome</h2>
<table>
    <tr>
        <td>Account: </td>
        <td>${user.account}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Age: </td>
        <td>${user.age}</td>
    </tr>
</table>
</body>
</html>
