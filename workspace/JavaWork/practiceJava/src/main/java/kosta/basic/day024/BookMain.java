package kosta.basic.day024;

import kosta.basic.day024.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class BookMain {
    public static void main(String[] args) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String insertQuery = "INSERT INTO BOOK VALUES (?, ?, ?, ?, ?)";
        String selectAllQuery = "select book_Id from book";
        BookDao bookDao = new BookDao();
//        bookDao.insert(new Book(1, "삼국지", "출판사1", "2002", 1), insertQuery);

        bookDao.selectAll(jdbcTemplate, selectAllQuery);

    }
}
