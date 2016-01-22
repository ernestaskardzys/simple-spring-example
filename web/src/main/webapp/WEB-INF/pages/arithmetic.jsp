<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Arithmetic functions</title>
    </head>
    <body>
        First number: ${param.first}, second number: ${param.second} <br />
        Sum: <c:out value="${sum}"/> <br />
        Subtraction: <c:out value="${subtract}"/> <br />
        Multiplication: <c:out value="${multiply}"/> <br />
        Division: <c:out value="${divide}"/> <br />
    </body>
</html>
