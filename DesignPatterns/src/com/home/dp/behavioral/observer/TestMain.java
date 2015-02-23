package com.home.dp.behavioral.observer;

public class TestMain {

    public static void main(String[] args) {

        Topic Topic = new Topic();

        Observer observer1 = new Subscriber("observer1");
        Observer observer2 = new Subscriber("observer2");
        Observer observer3 = new Subscriber("observer3");

        Topic.register(observer1);
        Topic.register(observer2);
        Topic.register(observer3);

        observer1.setSubject(Topic);
        observer2.setSubject(Topic);
        observer3.setSubject(Topic);

        observer1.update();

        Topic.postMessage("Here comes the message...");

    }

}
