<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Calculator</h1>
    <form action="/calculate/operate" method="post">
        <table>
            <tr>
                <td><input type="number" name="num1"></td>
                <td><input type="number" name="num2"></td>
            </tr>
            <tr>
                <td><input type="submit" name="operate" value="Addition(+)">
                    <input type="submit" name="operate" value="Subtraction(-)"></td>
                <td><input type="submit" name="operate" value="Multiplication(*)">
                    <input type="submit" name="operate" value="Division(/)"></td>
            </tr>
        </table>
    </form>

    <h3>Result Division : <span>${result}</span></h3>
</body>
</html>
