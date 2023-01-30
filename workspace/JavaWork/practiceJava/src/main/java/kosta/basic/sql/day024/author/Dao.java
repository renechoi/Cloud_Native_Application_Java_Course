package kosta.basic.sql.day024.author;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

    int insert(T t) throws SQLException;

    int delete(T t, String deleteIndex) throws SQLException;
    int update(T t, String updateIndexAt, String updateName, String updateDescription) throws SQLException;

    void selectAll() throws SQLException;
    List<AuthorVo> get( ) throws SQLException;

}
