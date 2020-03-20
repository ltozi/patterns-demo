package com.kaleyra.patterns.singleton.luigi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class DBConf {

    private static String DEFAULT_JDBC_URL = "jdbc:hsqldb:mem:inmemory;hsqldb.sqllog=3";

    private static PreparedStatement statement1;
    private static PreparedStatement statement2;
    private static PreparedStatement statement3;

    private static Connection conn;

    private static DBConf instance;

    private DBConf() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static DBConf getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConf();
            conn = DriverManager.getConnection(DEFAULT_JDBC_URL);
        }

        if(conn.isValid(2000)) {
            instance = null;
            return getInstance();
        }

        return instance;
    }

    public PreparedStatement insertPatient(String name) throws SQLException {
        statement1.setString(0, name);

        return statement1;
    }

    public void initializeStatements() throws SQLException {
        statement1 = conn.prepareStatement("SELECT  * FROM PAZIENTE WHERE NAME = ?");

        //TODO create statements...
        //        statement1 = conn.prepareStatement("SELECT  * FROM PAZIENTE WHERE NAME = ?");
//        statement1 = conn.prepareStatement("SELECT  * FROM PAZIENTE WHERE NAME = ?");
    }
}
