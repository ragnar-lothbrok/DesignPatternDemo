package com.home.dp.creational.singleton;

public class SingletonBillPush {

    private SingletonBillPush() {

    }

    private static class InnerClass {
        private static final SingletonBillPush singletonBillPush = new SingletonBillPush();
    }

    public static SingletonBillPush getInstance() {
        return InnerClass.singletonBillPush;
    }

}
