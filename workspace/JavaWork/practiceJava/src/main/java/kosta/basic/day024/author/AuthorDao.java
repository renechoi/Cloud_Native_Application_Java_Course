package kosta.basic.day024.author;

import kosta.basic.day024.jdbc.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuthorDao implements Dao<AuthorVo> {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    String selectAll = "select author_id, author_name name, author_desc from author";
    String insert = "INSERT INTO author VALUES (author_sequence_by_id.nextval, ?, ?)";
    String update = """
                UPDATE AUTHOR author
                SET author.AUTHOR_NAME = ?,
                    author.AUTHOR_DESC = ?
                WHERE author.AUTHOR_ID = ?
                """;
    String delete = "DELETE FROM AUTHOR author WHERE author.AUTHOR_ID = ?";
    String getList = """
                SELECT author.AUTHOR_ID
                       author.AUTHOR_NAME
                       author.AUTHOR_DESC
                FROM AUTHOR author
                """;

    @Override
    public int insert(AuthorVo authorVo) throws SQLException {
        return jdbcTemplate.executeInsert(insert, preparedStatement -> {
            preparedStatement.setString(1, authorVo.getAuthor_name());
            preparedStatement.setString(2, authorVo.getAuthor_description());
        });
    }

    @Override
    public int delete(AuthorVo authorVo, String deleteIndex) throws SQLException {
        return jdbcTemplate.executeDelete(delete, preparedStatement ->
                preparedStatement.setString(1, deleteIndex));
    }

    @Override
    public int update(AuthorVo authorVo, String updateIndexAt, String updateName, String updateDescription) throws SQLException {
        return jdbcTemplate.executeUpdate(update, preparedStatement -> {
            preparedStatement.setString(1, updateName);
            preparedStatement.setString(2, updateDescription);
            preparedStatement.setString(3, updateIndexAt);

        });
    }

    @Override
    public List<AuthorVo> getList() throws SQLException {

        ResultSet resultSet = jdbcTemplate.executeQuery(getList);

        List<AuthorVo> authorVos = new ArrayList<>();

        while (resultSet.next()) {
            authorVos.add(new AuthorVo(
                    resultSet.getInt("author_id"),
                    resultSet.getString("AUTHOR_NAME"),
                    resultSet.getString("AUTHOR_DESC")));
        }

        authorVos.stream().filter(Objects::nonNull).forEach(System.out::println);
        return authorVos;
    }

    public void selectAll() throws SQLException {
        ResultSet resultSet = jdbcTemplate.executeQuery(selectAll);
        print(resultSet);
    }

    private static void print(ResultSet resultSet) throws SQLException {
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
