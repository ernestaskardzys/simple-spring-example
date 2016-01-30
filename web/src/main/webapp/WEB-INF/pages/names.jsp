<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Names list</title>
    </head>
    <body>
        <c:forEach var="name" items="${names}">
            ${name.id} : ${name.name} <br />
        </c:forEach>
    </body>
</html>
