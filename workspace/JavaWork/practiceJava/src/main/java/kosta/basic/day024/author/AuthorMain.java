package kosta.basic.day024.author;

import java.sql.SQLException;

public class AuthorMain {
    public static void main(String[] args) throws SQLException {

        AuthorDao authorDao = new AuthorDao();

        int Result = authorDao.insert(new AuthorVo("기안84", "패션왕"));

        authorDao.selectAll();


    }
}
