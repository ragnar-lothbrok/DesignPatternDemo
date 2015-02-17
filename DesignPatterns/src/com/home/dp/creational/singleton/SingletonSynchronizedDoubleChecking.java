package com.home.dp.creational.singleton;

public class SingletonSynchronizedDoubleChecking {

    private static SingletonSynchronizedDoubleChecking instance = null;

    private SingletonSynchronizedDoubleChecking() {

    }

    public static SingletonSynchronizedDoubleChecking getInstance() {
        if (instance == null)
            synchronized (SingletonSynchronizedDoubleChecking.class) {
                if (instance == null)
                    instance = new SingletonSynchronizedDoubleChecking();
            }
        return instance;
    }

}
