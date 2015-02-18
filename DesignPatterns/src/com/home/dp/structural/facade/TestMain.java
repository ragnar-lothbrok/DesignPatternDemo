package com.home.dp.structural.facade;

import com.home.dp.structural.facade.FacadeHelper.DBTypes;
import com.home.dp.structural.facade.FacadeHelper.ReportTypes;

public class TestMain {
    
    public static void main(String[] args) {
        
        FacadeHelper facadeHelper = new FacadeHelper();
        
        facadeHelper.generateReport(DBTypes.MYSQL,ReportTypes.HTML,"Publisher");
        
        facadeHelper.generateReport(DBTypes.ORACLE,ReportTypes.PDF,"Publisher");
        
    }
    
}
