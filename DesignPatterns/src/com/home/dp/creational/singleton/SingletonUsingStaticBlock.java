package com.home.dp.creational.singleton;

public class SingletonUsingStaticBlock {

    private static SingletonUsingStaticBlock instance = null;

    static {
        try {
            instance = new SingletonUsingStaticBlock();
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }

    private SingletonUsingStaticBlock() {

    }

    public static SingletonUsingStaticBlock getInstance() {
        return instance;
    }

}
