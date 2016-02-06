<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="customtags" tagdir="/WEB-INF/tags" %>

<customtags:pageTemplate>

    <form:form method="get" action="/arithmetic/all" modelAttribute="form">
        <form:label path="firstNumber">Number: </form:label>
        <form:input path="firstNumber"/>
        <form:label path="secondNumber">Number: </form:label>
        <form:input path="secondNumber"/>
        <input type="submit" value="Submit!"/>
    </form:form>

</customtags:pageTemplate>