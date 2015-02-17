package com.home.dp.creational.singleton;

public class SingletonLazyInitialization {
    
    private static SingletonLazyInitialization instance = null;

    private SingletonLazyInitialization() {

    }

    public static SingletonLazyInitialization getInstance() {
        if(instance == null)
            instance = new SingletonLazyInitialization();
        return instance;
    }
    
}
