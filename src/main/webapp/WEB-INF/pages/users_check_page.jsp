<%-- 
    Document   : users_check_page
    Created on : Jun 14, 2017, 9:22:38 PM
    Author     : Alexcom
--%>
<%@ taglib  prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <spring:form modelAttribute="userFromServer" method="post" action="/user-system/users/check">
        <spring:input path="name"/>
        <spring:input path="password"/>
        <spring:button>check user</spring:button>
    </spring:form>
    </body>
</html>
