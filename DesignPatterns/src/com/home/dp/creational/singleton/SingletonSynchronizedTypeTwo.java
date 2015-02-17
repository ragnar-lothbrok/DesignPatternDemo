package com.home.dp.creational.singleton;

public class SingletonSynchronizedTypeTwo {

    private static SingletonSynchronizedTypeTwo instance = null;

    private SingletonSynchronizedTypeTwo() {

    }

    public static SingletonSynchronizedTypeTwo getInstance() {
        synchronized (SingletonSynchronizedTypeTwo.class) {
            if (instance == null)
                instance = new SingletonSynchronizedTypeTwo();
            return instance;
        }
    }

}
