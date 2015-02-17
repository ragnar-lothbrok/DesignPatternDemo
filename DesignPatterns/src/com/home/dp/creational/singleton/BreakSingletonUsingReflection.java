package com.home.dp.creational.singleton;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) {
        SingletonSynchronizedDoubleChecking instanceOne = SingletonSynchronizedDoubleChecking.getInstance();
        SingletonSynchronizedDoubleChecking instanceTwo = null;
        Constructor<?>[] ctors = SingletonSynchronizedDoubleChecking.class.getDeclaredConstructors();
        try {
            for (Constructor constructor : ctors) {
                constructor.setAccessible(true);
                instanceTwo = (SingletonSynchronizedDoubleChecking) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode()+" "+instanceTwo.hashCode());
    }

}
