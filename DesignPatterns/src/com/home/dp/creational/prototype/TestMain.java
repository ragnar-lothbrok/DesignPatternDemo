package com.home.dp.creational.prototype;

public class TestMain {
    
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.init();
        
        Manager clonedObj = (Manager) manager.clone();
        clonedObj.getEmployeesList().add("E");
        
        System.out.println(manager.hashCode()+" "+manager+" \n"+clonedObj.hashCode()+" "+clonedObj);
    }
    
}
