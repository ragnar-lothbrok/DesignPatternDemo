package com.home.dp.creational.singleton;

public class SingletonDeserializationType {

    private static SingletonDeserializationType instance = null;

    private SingletonDeserializationType() {

    }

    public static SingletonDeserializationType getInstance() {
        if (instance == null)
            synchronized (SingletonDeserializationType.class) {
                if (instance == null)
                    instance = new SingletonDeserializationType();
            }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
