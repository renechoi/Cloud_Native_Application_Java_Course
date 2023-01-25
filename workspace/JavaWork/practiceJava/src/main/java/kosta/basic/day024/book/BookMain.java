package kosta.basic.day024.book;

import kosta.basic.day024.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class BookMain {
    public static void main(String[] args) throws SQLException {
        BookDao bookDao = new BookDao();
    }

    private static void bookActions(BookDao bookDao) throws SQLException {
        bookDao.insert(new Book(29, "dd", "출판사3", "1995", 26));
        bookDao.selectById();

        Book book2 = bookDao.findBookByTitle("삼국지", resultSet -> new Book(
                resultSet.getInt("book_id"),
                resultSet.getString("title"),
                resultSet.getString("publisher"),
                resultSet.getString("pub_date"),
                resultSet.getInt("pub_date")));

        System.out.println(book2);

        Books books = bookDao.findBooksByContaining("삼");
        books.show();
    }
}
