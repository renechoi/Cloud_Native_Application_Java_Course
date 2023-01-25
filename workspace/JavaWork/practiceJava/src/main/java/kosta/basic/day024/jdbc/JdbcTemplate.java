package kosta.basic.day024.jdbc;

import kosta.basic.day024.author.AuthorVo;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

    @Test
    void validateCreate() throws SQLException {
        this.createTable("testTable");
    }

    public void createTable(String createName) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        Statement statement = connection.createStatement();
        String strCreate = String.format("CREATE TABLE %s (" + "\r\n" +
                "  dno varchar2(2),\r\n" +
                "  dname varchar2(14),\r\n" +
                "  loc varchar2(8) ,\r\n" +
                "  director  varchar2(4)\r\n" +
                ")", createName);

        int cnt = statement.executeUpdate(strCreate);
        System.out.println("리턴값 : " + cnt);
    }

    public void dropTable(String tableName) {
    }


    public int executeInsert(String sqlQuery, PreparedStatementSetter preparedStatementSetter) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatementSetter.setPreparedStatement(preparedStatement);

        return preparedStatement.executeUpdate();
    }

    public int executeUpdate(String sqlQuery, PreparedStatementSetter preparedStatementSetter) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatementSetter.setPreparedStatement(preparedStatement);

        return preparedStatement.executeUpdate();
    }

    public ResultSet executeQueryAll(String sqlQuery) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        return preparedStatement.executeQuery();
    }

    public int executeDelete(String sqlQuery, PreparedStatementSetter preparedStatementSetter) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatementSetter.setPreparedStatement(preparedStatement);

        return preparedStatement.executeUpdate();
    }

    public List<AuthorVo> getList(String sqlQuery) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        List<AuthorVo> authorVos = new ArrayList<>();

        while (resultSet.next()) {
            authorVos.add(new AuthorVo(
                    resultSet.getInt("author_id"),
                    resultSet.getString("AUTHOR_NAME"),
                    resultSet.getString("AUTHOR_DESC")));
        }

        return authorVos;
    }
}

