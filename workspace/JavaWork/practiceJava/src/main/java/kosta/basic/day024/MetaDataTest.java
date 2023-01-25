package kosta.basic.day024;

import kosta.basic.day024.jdbc.ConnectionManager;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class MetaDataTest {
    public static void main(String[] args) throws SQLException {
        ConnectionManager connectionManager = new ConnectionManager();

        Connection connection = ConnectionManager.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
                """
                SELECT *
                FROM COLS
                WHERE TABLE_NAME = 'BOOK'
                """);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount();

        String[] columnNames = new String[columnCount];
        for(int i=1; i<=columnCount; i++) {
            // Put column name into array
            columnNames[i-1] = resultSetMetaData.getColumnName(i);
        }

        while(resultSet.next()) {
            for (String columnName: columnNames) {
                // Print Column Name and value
                System.out.println(columnName+" "+resultSet.getObject(columnName));
            }
        }
    }

    @Test
    void validateCreate() throws SQLException {
        this.createTable("testTable");
    }

    public void createTable(String createName, String... tables) throws SQLException {
        Connection connection = ConnectionManager.getConnection();

        Statement statement = connection.createStatement();
        String strCreate = String.format(
                """
                        CREATE TABLE %s (
                        1 varchar2(10)
                        2 varchar2(10)
                        3 varchar2(10)
                        4 varchar2(10)
                        )
                        """, createName);
        int cnt = statement.executeUpdate(strCreate);
        System.out.println("리턴값 : " + cnt);
    }
}
