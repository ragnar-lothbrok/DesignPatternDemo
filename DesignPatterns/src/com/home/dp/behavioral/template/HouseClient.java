package com.home.dp.behavioral.template;

public class HouseClient {
        
    
    public static void main(String[] args) {
        
        HouseTemplate houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
        
        houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();
        
    }
    
}
