<%@ page contentType="text/html;charset=UTF-8"%>
<h1>성격 테스트 결과</h1>
<%
   String name = request.getParameter("name");
   String bloodType = request.getParameter("bloodType");
%>
<b><%=name%></b>님의 혈액형은
<b><%=bloodType%></b>형이고
알아서 대마왕입니다. 😇