package com.home.dp.structural.facade;

import java.sql.Connection;

public class FacadeHelper {

    public void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection = null;
        DatabaseHelper databaseHelper = null;
        if (DBTypes.MYSQL == dbType) {
            connection = MySQlHelper.getMySqlDBConnection();
            databaseHelper = new MySQlHelper();
        } else if (DBTypes.ORACLE == dbType) {
            connection = OracleHelper.getOracleDBConnection();
            databaseHelper = new OracleHelper();
        }
        generateReports(databaseHelper, tableName, connection, reportType);
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }

    public void generateReports(DatabaseHelper databaseHelper, String tableName, Connection con, ReportTypes reportType) {
        switch (reportType) {
            case HTML:
                databaseHelper.generateHTMLReport(tableName, con);
                break;
            case PDF:
                databaseHelper.generatePDFReport(tableName, con);
                break;

        }
    }

}
