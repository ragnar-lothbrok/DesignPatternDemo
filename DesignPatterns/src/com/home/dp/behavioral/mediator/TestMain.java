package com.home.dp.behavioral.mediator;

public class TestMain {

    public static void main(String[] args) {
        
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Raja");
        User user2 = new UserImpl(mediator, "Rohan");
        User user3 = new UserImpl(mediator, "Raunak");
        User user4 = new UserImpl(mediator, "Rosy");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.sendMessage("Hello World...");
        
    }
    
}
