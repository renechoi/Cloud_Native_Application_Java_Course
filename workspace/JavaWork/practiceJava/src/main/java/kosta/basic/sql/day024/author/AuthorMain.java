package kosta.basic.sql.day024.author;

import java.sql.SQLException;

public class AuthorMain {
    public static void main(String[] args) throws SQLException {

//        AuthorDao authorDao = new AuthorDao();

        Dao<AuthorVo> authorVoDao = new AuthorDao();

        int Result = authorVoDao.insert(new AuthorVo("기안84", "패션왕"));

        authorVoDao.selectAll();


    }
}
