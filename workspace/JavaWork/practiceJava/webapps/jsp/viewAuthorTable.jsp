<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%!
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME = "webdb";
    private static final String DB_PW = "oracle";

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "webdb";
    String pass = "oracle";

    String sql = " select author_id, author_name, author_desc from author"
            + " order by author_id ";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table width="800" border="1">
    <tr>
        <th>저자번호</th>
        <th>저자명</th>
        <th>설명</th>
    </tr>
    <%

        try {
            Class.forName(DB_DRIVER);
            System.out.println("DB 접속 성공");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PW);
        } catch (SQLException | RuntimeException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException("error");
        }

    %>
</table>

</body>
</html>