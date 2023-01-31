<%--
  Created by IntelliJ IDEA.
  User: Rene
  Date: 2023/01/31
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String queryString = request.getQueryString();
    String id = request.getParameter("id");
    String password = request.getParameter("password");
%>

<span><%=id%></span>
<span><%=id%></span>
</body>
</html>
