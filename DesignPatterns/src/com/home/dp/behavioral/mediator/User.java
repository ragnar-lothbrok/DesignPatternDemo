package com.home.dp.behavioral.mediator;

public abstract class User {

    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        super();
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void receiveMessage(String message);

    abstract void sendMessage(String message);

    @Override
    public String toString() {
        return "User [ name=" + name + "]";
    }

}
