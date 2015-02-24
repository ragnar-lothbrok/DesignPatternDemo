package com.home.dp.behavioral.state;

public class StartService implements State {

    @Override
    public void doAction() {
        System.out.println("Service Started...");
    }

}
