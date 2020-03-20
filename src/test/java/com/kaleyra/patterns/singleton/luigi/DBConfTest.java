package com.kaleyra.patterns.singleton.luigi;

import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConfTest {

    @Test
    public void shouldGetOneIstance() throws SQLException {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        DBConf singleton = DBConf.getInstance();

        PreparedStatement insertPatientQuery = singleton.insertPatient("Peppino");
        boolean execute = insertPatientQuery.execute();

        System.out.println(execute);

    }
}