package com.home.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    List<User> userList;

    public ChatMediatorImpl() {
        userList = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User usr : userList) {
            if (user != usr) {
                usr.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public String toString() {
        return "ChatMediatorImpl [userList=" + userList + "]";
    }

}
