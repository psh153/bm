<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring Boot JSP Example</title>
</head>
<body>
    <h2>Hello, JSP in Spring Boot!</h2>
    가나다라 <br/>
    <c:forEach var="view" items="${table}">
    	${view.eName}
    	${view.empNo} <br/>
    </c:forEach>
</body>
</html>