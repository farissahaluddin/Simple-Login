<%@ page import="com.faris.java.dto.User" %><%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 5/24/2018
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>

<h2> Login Successfully!!</h2>

<%
    User user = (User)request.getAttribute("user");
%>

Hello <%= user.getUserName() %>

</body>
</html>
