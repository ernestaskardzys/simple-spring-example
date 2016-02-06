<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="customtags" tagdir="/WEB-INF/tags" %>

<customtags:pageTemplate>

    First number: ${form.firstNumber}, second number: ${form.secondNumber} <br />
    Sum: <c:out value="${sum}"/> <br />
    Subtraction: <c:out value="${subtract}"/> <br />
    Multiplication: <c:out value="${multiply}"/> <br />
    Division: <c:out value="${divide}"/> <br />

</customtags:pageTemplate>

