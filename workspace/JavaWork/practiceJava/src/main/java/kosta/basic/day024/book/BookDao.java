package kosta.basic.day024.book;

import kosta.basic.day024.jdbc.JdbcTemplate;
import kosta.basic.day024.jdbc.RowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookDao {
    private static final JdbcTemplate JDBC_TEMPLATE = new JdbcTemplate();

    private enum queries {
        INSERT("INSERT INTO BOOK VALUES (?, ?, ?, ?, ?)"),
        DELETE("DELETE FROM BOOK WHERE book_id = ?"),
        UPDATE("""
                UPDATE AUTHOR author
                SET author.AUTHOR_NAME = ?,
                    author.AUTHOR_DESC = ?
                WHERE author.AUTHOR_ID = ?
                """),
        SELECT_BY_ID("SELECT book_id FROM BOOK"),
        SELECT_ALL("""
                SELECT *
                FROM book
                """),
        FIND_BY_TITLE("SELECT book_id, title, publisher, pub_date, author_id FROM book WHERE title = ?"),
        GET_COLUMNS("""
                        SELECT *
                        FROM COLS
                        WHERE TABLE_NAME = 'BOOK'
                        """);

        private final String sql;

        queries(String sql) {
            this.sql = sql;
        }
    }

    public int join() throws SQLException {
        String query = """
                SELECT BOOK_ID, TITLE, PUBLISHER, PUB_DATE, book.AUTHOR_ID
                from Book book, AUTHOR author
                where book.AUTHOR_ID = author.AUTHOR_ID;
                        """;

        JDBC_TEMPLATE.executeQuery(query);

        return 0;
    }

    public int insert(Book book) throws SQLException {
        return JDBC_TEMPLATE.executeUpdate(queries.INSERT.sql, preparedStatement -> {
            preparedStatement.setInt(1, book.getBookId());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getPublisher());
            preparedStatement.setString(4, book.getPublishDate());
            preparedStatement.setInt(5, book.getAuthorId());
        });
    }

    public int delete(Book Book, String deleteIndex) throws SQLException {
        return JDBC_TEMPLATE.executeDelete(queries.DELETE.sql, preparedStatement ->
                preparedStatement.setString(1, deleteIndex));
    }

    public int update(Book book, String updateIndexAt, String updateName, String updateDescription) throws SQLException {
        return JDBC_TEMPLATE.executeUpdate(queries.UPDATE.sql, preparedStatement -> {
            preparedStatement.setString(1, updateName);
            preparedStatement.setString(2, updateDescription);
            preparedStatement.setString(3, updateIndexAt);
        });
    }

    private ResultSet selectAll() throws SQLException {
        return JDBC_TEMPLATE.executeQuery(queries.SELECT_ALL.sql);
    }

    public void selectById() throws SQLException {
        ResultSet resultSet = JDBC_TEMPLATE.executeQuery(queries.SELECT_BY_ID.sql);
        printById(resultSet);
    }

    public Book findBookByTitle(String title, RowMapper rowMapper) throws SQLException {
        ResultSet resultSet = JDBC_TEMPLATE.executeQuery(queries.FIND_BY_TITLE.sql,
                preparedStatement -> preparedStatement.setString(1, title));

        Object object = null;
        if (resultSet.next()) {
            return (Book) rowMapper.mapRow(resultSet);
        }
        return (Book) object;
    }

    public Books findBooksByContaining(String value) throws SQLException {
        ResultSet resultSet = selectAll();

        List<Book> books = new ArrayList<>();
        while (resultSet.next()) {
            books.add(new Book(
                    resultSet.getInt("book_id"),
                    resultSet.getString("title"),
                    resultSet.getString("publisher"),
                    resultSet.getString("pub_date"),
                    resultSet.getInt("author_id")));
        }

        return new Books(books.stream()
                .filter(book -> book.contains(value))
                .collect(Collectors.toList()));
    }

    private static void printById(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.printf("""
                    bookId: %s
                    """, resultSet.getInt("book_id"));
        }
    }

    private List<String> getColumnNames(String getColumns) throws SQLException {
        ResultSet resultSet = JDBC_TEMPLATE.executeQuery(queries.GET_COLUMNS.sql);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        int columnCount = resultSetMetaData.getColumnCount();

        List<String> allColumns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            allColumns.add(resultSetMetaData.getColumnName(i));
        }

        List<String> columnNames = new ArrayList<>();
        while (resultSet.next()) {
            for (String column : allColumns) {
                if (column.equals("COLUMN_NAME")) {
                    columnNames.add(String.valueOf(resultSet.getObject(column)));
                }
            }
        }
        return columnNames;
    }
}
