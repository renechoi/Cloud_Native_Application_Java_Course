<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Insert title here</title>
</head>
<body>
<%
    int a = 1;
    int b = 4;
    int sum = a+b;
    String s = "헬로  JSP";
%>

<h1> <%= sum %></h1>
<h2> <%= s %></h2>

</body>
</html>