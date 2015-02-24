package com.home.dp.behavioral.state;

public class StopService implements State {

    @Override
    public void doAction() {
        System.out.println("Service Stopped...");
    }

}
