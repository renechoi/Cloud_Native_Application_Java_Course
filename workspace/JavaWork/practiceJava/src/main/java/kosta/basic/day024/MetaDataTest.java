package kosta.basic.day024;

import kosta.basic.day024.jdbc.ConnectionManager;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetaDataTest {
    public static void main(String[] args) throws SQLException {

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
