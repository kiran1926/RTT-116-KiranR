package org.example.M305_Homework.GLAB_305_3_1_DAOinterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDAO {
    static Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;
    public static Connection getConnection() throws ClassNotFoundException {
        final String  DBURL  = "jdbc:mysql://localhost:3305/library";
        final String DBUSERNAME = "root";
        final String  DBPASSWORD = "password";

        return null;
    }
}
