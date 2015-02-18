package com.home.dp.structural.facade;

import java.sql.Connection;

public class MySQlHelper implements DatabaseHelper {

    public static Connection getMySqlDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }

    public void generatePDFReport(String tableName, Connection con) {
         System.out.println("generatePDFReport from : "+this.getClass());
    }

    @Override
    public void generateHTMLReport(String tableName, Connection con) {
        System.out.println("generateHTMLReport from : " + this.getClass());

    }

}
