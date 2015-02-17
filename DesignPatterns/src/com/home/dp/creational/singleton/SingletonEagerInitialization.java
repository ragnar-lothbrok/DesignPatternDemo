package com.home.dp.creational.singleton;

public class SingletonEagerInitialization {

    private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {

    }

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }

}
