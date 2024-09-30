<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-21
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table>
      <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Contact</th>
      </tr>
      <tr>
          <td>${employee.id}</td>
          <td>${employee.name}</td>
          <td>${employee.contactNumber}</td>
      </tr>
  </table>
</body>
</html>
