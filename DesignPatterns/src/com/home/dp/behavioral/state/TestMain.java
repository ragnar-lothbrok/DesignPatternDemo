package com.home.dp.behavioral.state;

public class TestMain {

    public static void main(String[] args) {

        Context context = new Context();
        StartService startService = new StartService();
        context.setState(startService);
        context.doAction();

    }

}
