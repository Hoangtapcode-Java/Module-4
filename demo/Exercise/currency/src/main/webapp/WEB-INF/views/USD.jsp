<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>QUY ĐỔI TIỀN TỆ</h1>
    <form action="/currency" method="post">
        <table>
            <tr>
                <td>USD</td>
                <td><input type="number" name="usd"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
                <td><input type="reset"></td>
            </tr>
        </table>
    </form>
    <p>Result: <span>${change}</span></p>
</body>
</html>
