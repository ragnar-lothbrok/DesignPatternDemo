package com.home.dp.creational.singleton;

public class SingletonSynchronizedTypeOne {
    
    private static SingletonSynchronizedTypeOne instance = null;

    private SingletonSynchronizedTypeOne() {

    }

    public synchronized static SingletonSynchronizedTypeOne getInstance() {
        if(instance == null)
            instance = new SingletonSynchronizedTypeOne();
        return instance;
    }
    
}
