package com.home.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Cloneable {

    List<String> employeesList;

    public List<String> getEmployeesList() {
        if (this.employeesList == null)
            this.employeesList = new ArrayList<String>();
        return employeesList;
    }

    public void setEmployeesList(List<String> employeesList) {
        this.employeesList = employeesList;
    }

    public Object clone() {
        List<String> tempEmpList = new ArrayList<String>();
        if (this.employeesList != null) {
            for (String empployee : employeesList) {
                tempEmpList.add(empployee);
            }
        }
        return new Manager(tempEmpList);
    }

    public void init() {
        this.getEmployeesList().add("A");
        this.getEmployeesList().add("B");
        this.getEmployeesList().add("C");
        this.getEmployeesList().add("D");
    }

    public Manager(List<String> employeesList) {
        this.employeesList = employeesList;
    }
    
    public Manager() {
        
    }

    @Override
    public String toString() {
        return "Manager [employeesList=" + employeesList + "]";
    }
}
