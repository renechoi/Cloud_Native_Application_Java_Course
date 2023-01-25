package kosta.basic.day024;

import kosta.basic.day024.author.AuthorVo;

import java.sql.SQLException;
import java.util.List;

public interface Dao {

    int insert(AuthorVo vo) throws SQLException;

    int delete(AuthorVo vo, String deleteIndex) throws SQLException;
    int update(AuthorVo vo, String updateIndexAt, String updateName, String updateDescription) throws SQLException;
    List<AuthorVo> getList( ) throws SQLException;

}
