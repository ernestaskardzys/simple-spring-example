<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="customtags" tagdir="/WEB-INF/tags" %>

<customtags:pageTemplate>
    <c:forEach var="student" items="${students}">
        ${student.id} : ${student.age} : ${student.course} <br />
    </c:forEach>
</customtags:pageTemplate>