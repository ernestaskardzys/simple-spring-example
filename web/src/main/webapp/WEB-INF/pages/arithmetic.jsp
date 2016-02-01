<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Arithmetic functions</title>

        <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script src="/resources/jquery/jquery-2.2.0.js"></script>
        <script src="/resources/bootstrap/js/bootstrap.js"></script>

        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <h1>Hello, world!</h1>
        First number: ${param.first}, second number: ${param.second} <br />
        Sum: <c:out value="${sum}"/> <br />
        Subtraction: <c:out value="${subtract}"/> <br />
        Multiplication: <c:out value="${multiply}"/> <br />
        Division: <c:out value="${divide}"/> <br />
    </body>
</html>