package kosta.basic.day024.author;

import kosta.basic.day024.author.AuthorVo;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

    int insert(T t) throws SQLException;

    int delete(AuthorVo authorVo, String deleteIndex) throws SQLException;
    int update(AuthorVo authorVo, String updateIndexAt, String updateName, String updateDescription) throws SQLException;
    List<AuthorVo> getList( ) throws SQLException;

}
