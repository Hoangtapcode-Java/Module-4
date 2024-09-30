<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-15
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Danh sách khách hàng</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${customer}" var="customers">
            <tr>
                <td>${customers.id}</td>
                <td>${customers.name}</td>
                <td>${customers.email}</td>
                <td>${customers.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
