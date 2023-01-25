package kosta.basic.day024;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String selectAllQuery = "select author_id, author_name name, author_desc from author";
        String insertQuery = "INSERT INTO author VALUES (author_sequence_by_id.nextval, ?, ?)";
        String updateQuery = """
                UPDATE AUTHOR author
                SET author.AUTHOR_NAME = '홍길순',
                    author.AUTHOR_DESC = '서울특별시'
                WHERE author.AUTHOR_ID = ?""";
        String deleteQuery = "DELETE FROM AUTHOR author WHERE author.AUTHOR_ID = 22";

//        insert(jdbcTemplate, insertQuery);
//        delete(jdbcTemplate, deleteQuery);
//        update(jdbcTemplate, updateQuery);

        selectAll(jdbcTemplate, selectAllQuery);
    }

    private static void update(JdbcTemplate jdbcTemplate, String updateQuery) throws SQLException {
        jdbcTemplate.executeUpdate(updateQuery, preparedStatement -> {
            preparedStatement.setString(1, "21");
        });
    }

    private static void delete(JdbcTemplate jdbcTemplate, String deleteQuery) throws SQLException {
        int count = jdbcTemplate.executeDelete(deleteQuery);
    }

    private static void insert(JdbcTemplate jdbcTemplate, String updateQuery) throws SQLException {
        int count = jdbcTemplate.executeInsert(updateQuery, preparedStatement -> {
            preparedStatement.setString(1, "홍길동");
            preparedStatement.setString(2, "의적");
        });
    }

    private static void selectAll(JdbcTemplate jdbcTemplate, String selectAllQuery) throws SQLException {
        ResultSet resultSet = jdbcTemplate.executeQueryAll(selectAllQuery);
        printConsoleResultSet(resultSet);
    }

    private static void printConsoleResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int authorId = resultSet.getInt("author_id");
            String authorName = resultSet.getString("name");
            String authorDesc = resultSet.getString("author_desc");
            System.out.printf("""
                    authorId: %s authorName: %s authorDesc: %s
                    """, authorId, authorName, authorDesc);
        }
    }
}
