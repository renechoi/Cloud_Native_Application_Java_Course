package kosta.basic.day024;

import java.sql.*;

public class JdbcTemplate {

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

    public int executeDelete(String sqlQuery) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        return preparedStatement.executeUpdate();
    }
}

