package com.home.dp.behavioral.mediator;

public interface ChatMediator {
    public void sendMessage(String message, User user);

    void addUser(User user);

}
