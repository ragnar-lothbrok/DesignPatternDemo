package com.home.dp.structural.facade;

import java.sql.Connection;

public interface DatabaseHelper {
    public void generatePDFReport(String tableName, Connection con);

    public void generateHTMLReport(String tableName, Connection con);
}
