package com.home.dp.structural.facade;

import java.sql.Connection;

public class OracleHelper implements DatabaseHelper {

    public static Connection getOracleDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }

    public void generatePDFReport(String tableName, Connection con) {
        System.out.println("generatePDFReport from : "+this.getClass());
    }

    public void generateHTMLReport(String tableName, Connection con) {
        System.out.println("generateHTMLReport from : "+this.getClass());
    }

}
