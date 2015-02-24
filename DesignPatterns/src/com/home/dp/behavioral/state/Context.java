package com.home.dp.behavioral.state;

public class Context implements State {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }

}
