package kosta.basic.day024.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
    void setPreparedStatement(PreparedStatement preparedStatement) throws SQLException;
}
