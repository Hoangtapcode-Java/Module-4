<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-21
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form:form action="/employee/infor" method="post" modelAttribute="employee">
      <table>
          <tr>
              <td><form:label path="id">ID:</form:label></td>
              <td><form:input path="id"></form:input></td>
          </tr>
          <tr>
              <td><form:label path="name">Name: </form:label></td>
              <td><form:input path="name"></form:input></td>
          </tr>
          <tr>
              <td><form:label path="contactNumber">Contact: </form:label></td>
              <td><form:input path="contactNumber"></form:input></td>
          </tr>
          <tr>
              <td><input type="submit" value="Submit"></td>
              <td><input type="reset" value="Reset"></td>
          </tr>
      </table>
  </form:form>
</body>
</html>
