package com.home.dp.behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("Message Received : "+message+" Name : "+name);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Message Sending : "+message+" Name : "+name);
        this.chatMediator.sendMessage(message, this);
    }

}
