package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by seohyowon on 2014. 6. 11..
 */
public interface ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
