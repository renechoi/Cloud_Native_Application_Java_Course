package kosta.basic.day024;

import kosta.basic.day024.jdbc.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {

    public void insert(Book book, String sql) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.executeUpdate(sql, preparedStatement -> {
            preparedStatement.setInt(1, book.getBookId());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getPublisher());
            preparedStatement.setString(4, book.getPublishDate());
            preparedStatement.setInt(5, book.getAuthorId());
        });
    }

    public static void selectAll(JdbcTemplate jdbcTemplate, String selectAllQuery) throws SQLException {
        ResultSet resultSet = jdbcTemplate.executeQueryAll(selectAllQuery);
        printConsoleResultSet(resultSet);
    }

    private static void printConsoleResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int authorId = resultSet.getInt("book_id");
            System.out.printf("""
                    bookId: %s
                    """, authorId);
        }
    }

/*
    BOOK_ID,NUMBER
            TITLE,VARCHAR2
    PUBS,VARCHAR2
            PUB_DATE,DATE
    AUTHOR_ID,NUMBER
*/
//
//
//    public Book findByAuthorName(String userId) throws SQLException {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//
//        String sql = "SELECT userId, password, name, email FROM USERS WHERE userid = ?";
//        return (User) jdbcTemplate.executeQuery(sql,
//                pstmt -> pstmt.setString(1, userId),
//                resultSet -> new User(
//                        resultSet.getString("userId"),
//                        resultSet.getString("password"),
//                        resultSet.getString("name"),
//                        resultSet.getString("email")
//                ));
//    }
}
